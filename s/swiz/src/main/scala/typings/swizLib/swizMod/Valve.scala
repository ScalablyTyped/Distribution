package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("swiz", "Valve")
@js.native
class Valve protected () extends js.Object {
  def this(schema: IValveSchema) = this()
  def this(schema: IValveSchema, baton: js.Any) = this()
  def addChainValidator(
    name: java.lang.String,
    description: java.lang.String,
    func: js.Function2[
      /* value */ js.Any, 
      /* callback */ js.Function2[/* err */ stdLib.Error, /* cleaned */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def addFinalValidator(
    func: js.Function2[
      /* obj */ js.Any, 
      /* callback */ js.Function2[/* err */ stdLib.Error, /* cleaned */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ): Valve = js.native
  def check(obj: js.Any, callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, scala.Unit]): scala.Unit = js.native
  def check(
    obj: js.Any,
    options: ICheckOptions,
    callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def checkUpdate(
    existing: js.Any,
    obj: js.Any,
    callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def help(schema: IValveSchema): js.Any = js.native
  def setSchema(schema: IValveSchema): Valve = js.native
}

