package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Progress extends js.Object {
  var progress: Double
  var totalBytesExpectedToWrite: Double
  var totalBytesWritten: Double
}

object Anon_Progress {
  @scala.inline
  def apply(progress: Double, totalBytesExpectedToWrite: Double, totalBytesWritten: Double): Anon_Progress = {
    val __obj = js.Dynamic.literal(progress = progress, totalBytesExpectedToWrite = totalBytesExpectedToWrite, totalBytesWritten = totalBytesWritten)
  
    __obj.asInstanceOf[Anon_Progress]
  }
}

