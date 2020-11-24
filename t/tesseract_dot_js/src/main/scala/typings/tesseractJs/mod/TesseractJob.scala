package typings.tesseractJs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TesseractJob extends js.Object {
  
  def `catch`(callback: js.Function1[/* error */ Error, Unit]): TesseractJob = js.native
  
  var error: js.UndefOr[js.Function1[/* error */ Error, this.type]] = js.native
  
  def `finally`(callback: js.Function1[/* resultOrError */ Error | Page, Unit]): TesseractJob = js.native
  
  def progress(callback: js.Function1[/* progress */ Progress, Unit]): TesseractJob = js.native
  
  def `then`(callback: js.Function1[/* result */ Page, Unit]): TesseractJob = js.native
}
object TesseractJob {
  
  @scala.inline
  def apply(
    `catch`: js.Function1[/* error */ Error, Unit] => TesseractJob,
    `finally`: js.Function1[/* resultOrError */ Error | Page, Unit] => TesseractJob,
    progress: js.Function1[/* progress */ Progress, Unit] => TesseractJob,
    `then`: js.Function1[/* result */ Page, Unit] => TesseractJob
  ): TesseractJob = {
    val __obj = js.Dynamic.literal(progress = js.Any.fromFunction1(progress))
    __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
    __obj.asInstanceOf[TesseractJob]
  }
  
  @scala.inline
  implicit class TesseractJobOps[Self <: TesseractJob] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCatch(value: js.Function1[/* error */ Error, Unit] => TesseractJob): Self = this.set("catch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFinally(value: js.Function1[/* resultOrError */ Error | Page, Unit] => TesseractJob): Self = this.set("finally", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgress(value: js.Function1[/* progress */ Progress, Unit] => TesseractJob): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setThen(value: js.Function1[/* result */ Page, Unit] => TesseractJob): Self = this.set("then", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: /* error */ Error => TesseractJob): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
