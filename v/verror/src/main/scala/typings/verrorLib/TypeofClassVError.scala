package typings
package verrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassVError
  extends org.scalablytyped.runtime.Instantiable3[
      (/* options */ stdLib.Error) | (/* options */ verrorLib.verrorMod.Options), 
      /* message */ java.lang.String, 
      /* params (repeated) */ js.Any, 
      verrorLib.verrorMod.VError
    ] {
  def cause(err: stdLib.Error): stdLib.Error | scala.Null = js.native
  def errorForEach(err: stdLib.Error, func: js.Function1[/* err */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  def errorFromList[T /* <: stdLib.Error */](errors: js.Array[T]): scala.Null | T | verrorLib.verrorMod.MultiError = js.native
  def findCauseByName(err: stdLib.Error, name: java.lang.String): stdLib.Error | scala.Null = js.native
  def fullStack(err: stdLib.Error): java.lang.String = js.native
  def hasCauseWithName(err: stdLib.Error, name: java.lang.String): scala.Boolean = js.native
  def info(err: stdLib.Error): verrorLib.verrorMod.Info = js.native
}

