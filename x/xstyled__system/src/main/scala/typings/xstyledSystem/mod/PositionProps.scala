package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PositionProps extends StObject {
  
  val position: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
    ]
  ] = js.native
}
object PositionProps {
  
  @scala.inline
  def apply(): PositionProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PositionProps]
  }
  
  @scala.inline
  implicit class PositionPropsMutableBuilder[Self <: PositionProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosition(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.Position */ _
        ]
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setPositionVarargs(value: js.Any*): Self = StObject.set(x, "position", js.Array(value :_*))
  }
}
