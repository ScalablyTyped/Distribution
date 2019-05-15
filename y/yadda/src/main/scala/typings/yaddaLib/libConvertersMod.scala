package typings
package yaddaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib/converters", JSImport.Namespace)
@js.native
object libConvertersMod extends js.Object {
  def date(
    value: java.lang.String,
    next: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ stdLib.Date, scala.Unit]
  ): scala.Unit = js.native
  def float(
    value: java.lang.String,
    next: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def integer(
    value: java.lang.String,
    next: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  def list(
    value: java.lang.String,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def pass_through(
    value: java.lang.String,
    next: js.Function2[/* err */ stdLib.Error | scala.Null, /* value */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
  def table(
    value: java.lang.String,
    next: js.Function2[
      /* err */ stdLib.Error | scala.Null, 
      /* value */ js.Array[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

