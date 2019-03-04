package typings
package tesseractDotJsLib.tesseractDotJsMod.TesseractNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TesseractJob extends js.Object {
  var error: js.UndefOr[js.Function1[/* error */ nodeLib.Error, TesseractJob]] = js.undefined
  def `catch`(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): TesseractJob
  def `finally`(callback: js.Function1[/* resultOrError */ nodeLib.Error | Page, scala.Unit]): TesseractJob
  def progress(callback: js.Function1[/* progress */ Progress, scala.Unit]): TesseractJob
  def `then`(callback: js.Function1[/* result */ Page, scala.Unit]): TesseractJob
}

object TesseractJob {
  @scala.inline
  def apply(
    `catch`: js.Function1[js.Function1[/* error */ nodeLib.Error, scala.Unit], TesseractJob],
    `finally`: js.Function1[js.Function1[/* resultOrError */ nodeLib.Error | Page, scala.Unit], TesseractJob],
    progress: js.Function1[js.Function1[/* progress */ Progress, scala.Unit], TesseractJob],
    `then`: js.Function1[js.Function1[/* result */ Page, scala.Unit], TesseractJob],
    error: js.Function1[/* error */ nodeLib.Error, TesseractJob] = null
  ): TesseractJob = {
    val __obj = js.Dynamic.literal(progress = progress)
    __obj.updateDynamic("catch")(`catch`)
    __obj.updateDynamic("finally")(`finally`)
    __obj.updateDynamic("then")(`then`)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[TesseractJob]
  }
}

