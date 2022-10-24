package typings.wixStyleReact

import typings.wixStyleReact.anon.Type
import typings.wixStyleReact.anon.TypeValidation
import typings.wixStyleReact.anon.Validation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCompositeCompositeValidationMod {
  
  @JSImport("wix-style-react/dist/types/Composite/CompositeValidation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def any(): Validation = ^.asInstanceOf[js.Dynamic].applyDynamic("any")().asInstanceOf[Validation]
  
  inline def children(rules: Any*): js.Function3[/* props */ Any, /* propName */ Any, /* componentName */ Any, js.UndefOr[js.Error]] = ^.asInstanceOf[js.Dynamic].applyDynamic("children")(rules.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Function3[/* props */ Any, /* propName */ Any, /* componentName */ Any, js.UndefOr[js.Error]]]
  
  inline def multiple(`type`: Any): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("multiple")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def once(`type`: Any): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
  
  inline def oneOf(types: Any*): TypeValidation = ^.asInstanceOf[js.Dynamic].applyDynamic("oneOf")(types.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TypeValidation]
  
  inline def optional(`type`: Any): Type = ^.asInstanceOf[js.Dynamic].applyDynamic("optional")(`type`.asInstanceOf[js.Any]).asInstanceOf[Type]
}
