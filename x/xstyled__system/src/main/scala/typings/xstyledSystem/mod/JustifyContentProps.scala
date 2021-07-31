package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JustifyContentProps extends StObject {
  
  val justifyContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any
    ]
  ] = js.undefined
}
object JustifyContentProps {
  
  @scala.inline
  def apply(): JustifyContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifyContentProps]
  }
  
  @scala.inline
  implicit class JustifyContentPropsMutableBuilder[Self <: JustifyContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJustifyContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any
        ]
    ): Self = StObject.set(x, "justifyContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifyContentUndefined: Self = StObject.set(x, "justifyContent", js.undefined)
    
    @scala.inline
    def setJustifyContentVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifyContent */ js.Any)*
    ): Self = StObject.set(x, "justifyContent", js.Array(value :_*))
  }
}
