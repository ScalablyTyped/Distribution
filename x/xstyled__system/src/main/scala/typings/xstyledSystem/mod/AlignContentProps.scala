package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignContentProps extends StObject {
  
  val alignContent: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any
    ]
  ] = js.undefined
}
object AlignContentProps {
  
  @scala.inline
  def apply(): AlignContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlignContentProps]
  }
  
  @scala.inline
  implicit class AlignContentPropsMutableBuilder[Self <: AlignContentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlignContent(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any
        ]
    ): Self = StObject.set(x, "alignContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignContentUndefined: Self = StObject.set(x, "alignContent", js.undefined)
    
    @scala.inline
    def setAlignContentVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.AlignContent */ js.Any)*
    ): Self = StObject.set(x, "alignContent", js.Array(value :_*))
  }
}
