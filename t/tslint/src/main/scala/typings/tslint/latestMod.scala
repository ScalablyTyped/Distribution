package typings.tslint

import typings.tslint.anon.OptionsArray
import typings.tslint.anon.OptionsNumber
import typings.tslint.anon.OptionsString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tslint/lib/configs/latest", JSImport.Namespace)
@js.native
object latestMod extends js.Object {
  
  val `extends`: /* "tslint:recommended" */ String = js.native
  
  @js.native
  object rules extends js.Object {
    
    var align: OptionsArray = js.native
    
    var `ban-comma-operator`: Boolean = js.native
    
    var `function-constructor`: Boolean = js.native
    
    var `jsdoc-format`: OptionsString = js.native
    
    var `no-duplicate-imports`: Boolean = js.native
    
    var `no-duplicate-switch-case`: Boolean = js.native
    
    var `no-duplicate-variable`: OptionsString = js.native
    
    var `no-implicit-dependencies`: Boolean = js.native
    
    var `no-invalid-template-strings`: Boolean = js.native
    
    var `no-object-literal-type-assertion`: Boolean = js.native
    
    var `no-return-await`: Boolean = js.native
    
    var `no-sparse-arrays`: Boolean = js.native
    
    var `no-submodule-imports`: Boolean = js.native
    
    var `no-this-assignment`: Boolean = js.native
    
    var `prefer-conditional-expression`: Boolean = js.native
    
    var `prefer-object-spread`: Boolean = js.native
    
    var `space-within-parens`: OptionsNumber = js.native
    
    var `unnecessary-bind`: Boolean = js.native
    
    var whitespace: OptionsArray = js.native
  }
}
