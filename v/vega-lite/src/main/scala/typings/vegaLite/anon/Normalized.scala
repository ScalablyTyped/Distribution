package typings.vegaLite.anon

import typings.vegaLite.buildSrcSpecBaseMod.LayoutSizeMixins
import typings.vegaLite.buildSrcSpecMod.NormalizedSpec
import typings.vegaLite.buildSrcSpecToplevelMod.TopLevel
import typings.vegaTypings.typesSpecMod.Spec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Normalized extends StObject {
  
  var normalized: TopLevel[NormalizedSpec] & LayoutSizeMixins
  
  var spec: Spec
}
object Normalized {
  
  inline def apply(normalized: TopLevel[NormalizedSpec] & LayoutSizeMixins, spec: Spec): Normalized = {
    val __obj = js.Dynamic.literal(normalized = normalized.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[Normalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Normalized] (val x: Self) extends AnyVal {
    
    inline def setNormalized(value: TopLevel[NormalizedSpec] & LayoutSizeMixins): Self = StObject.set(x, "normalized", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: Spec): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
  }
}
