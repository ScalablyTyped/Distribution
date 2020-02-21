package typings.webpackStream

import org.scalablytyped.runtime.Instantiable1
import typings.webpack.AnonModule
import typings.webpack.mod.DefinePlugin.CodeValuePrimitive
import typings.webpack.mod.DefinePlugin.RuntimeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofDefinePlugin extends js.Object {
  var RuntimeValue: Instantiable1[
    /* fn */ js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive], 
    typings.webpack.mod.DefinePlugin.RuntimeValue
  ]
}

object TypeofDefinePlugin {
  @scala.inline
  def apply(
    RuntimeValue: Instantiable1[
      /* fn */ js.Function1[/* hasModule */ AnonModule, CodeValuePrimitive], 
      RuntimeValue
    ]
  ): TypeofDefinePlugin = {
    val __obj = js.Dynamic.literal(RuntimeValue = RuntimeValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofDefinePlugin]
  }
}

