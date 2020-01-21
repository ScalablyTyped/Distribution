package typings.verror

import org.scalablytyped.runtime.Instantiable3
import typings.std.Error
import typings.verror.mod.Info
import typings.verror.mod.MultiError
import typings.verror.mod.Options
import typings.verror.mod.VError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassVError
  extends Instantiable3[
      (/* options */ Error) | (/* options */ Options), 
      /* message */ String, 
      /* params (repeated) */ js.Any, 
      VError
    ] {
  def cause(err: Error): Error | Null = js.native
  def errorForEach(err: Error, func: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def errorFromList[T /* <: Error */](errors: js.Array[T]): Null | T | MultiError = js.native
  def findCauseByName(err: Error, name: String): Error | Null = js.native
  def fullStack(err: Error): String = js.native
  def hasCauseWithName(err: Error, name: String): Boolean = js.native
  def info(err: Error): Info = js.native
}

