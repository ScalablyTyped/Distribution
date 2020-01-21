package typings.tesseractJs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesseractJob extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ Error, TesseractJob]] = js.undefined
  def `catch`(callback: js.Function1[/* error */ Error, Unit]): TesseractJob
  def `finally`(callback: js.Function1[/* resultOrError */ Error | Page, Unit]): TesseractJob
  def progress(callback: js.Function1[/* progress */ Progress, Unit]): TesseractJob
  def `then`(callback: js.Function1[/* result */ Page, Unit]): TesseractJob
}

object TesseractJob {
  @scala.inline
  def apply(
    `catch`: js.Function1[/* error */ Error, Unit] => TesseractJob,
    `finally`: js.Function1[/* resultOrError */ Error | Page, Unit] => TesseractJob,
    progress: js.Function1[/* progress */ Progress, Unit] => TesseractJob,
    `then`: js.Function1[/* result */ Page, Unit] => TesseractJob,
    error: /* error */ Error => TesseractJob = null
  ): TesseractJob = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    __obj.asInstanceOf[TesseractJob]
  }
}

