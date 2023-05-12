package typings.vueCompilerSfc.mod

import typings.babelTypes.mod.TSCallSignatureDeclaration_
import typings.babelTypes.mod.TSFunctionType_
import typings.std.Record
import typings.vueCompilerSfc.anon.TSMethodSignatureownerSco
import typings.vueCompilerSfc.anon.TSPropertySignatureownerS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedElements extends StObject {
  
  var calls: js.UndefOr[js.Array[TSCallSignatureDeclaration_ | TSFunctionType_]] = js.undefined
  
  var props: Record[String, TSPropertySignatureownerS | TSMethodSignatureownerSco]
}
object ResolvedElements {
  
  inline def apply(props: Record[String, TSPropertySignatureownerS | TSMethodSignatureownerSco]): ResolvedElements = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedElements] (val x: Self) extends AnyVal {
    
    inline def setCalls(value: js.Array[TSCallSignatureDeclaration_ | TSFunctionType_]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
    
    inline def setCallsUndefined: Self = StObject.set(x, "calls", js.undefined)
    
    inline def setCallsVarargs(value: (TSCallSignatureDeclaration_ | TSFunctionType_)*): Self = StObject.set(x, "calls", js.Array(value*))
    
    inline def setProps(value: Record[String, TSPropertySignatureownerS | TSMethodSignatureownerSco]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
