package typings.vscodeLanguageclient.anon

import typings.vscodeLanguageclient.libCommonFeaturesMod.FeatureState
import typings.vscodeLanguageclient.vscodeLanguageclientStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`
  extends StObject
     with FeatureState {
  
  var kind: static
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(kind = "static")
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setKind(value: static): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
