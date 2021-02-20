package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridAutoFlowProps extends StObject {
  
  val gridAutoFlow: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
    ]
  ] = js.native
}
object GridAutoFlowProps {
  
  @scala.inline
  def apply(): GridAutoFlowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridAutoFlowProps]
  }
  
  @scala.inline
  implicit class GridAutoFlowPropsMutableBuilder[Self <: GridAutoFlowProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGridAutoFlow(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.GridAutoFlow */ _
        ]
    ): Self = StObject.set(x, "gridAutoFlow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAutoFlowUndefined: Self = StObject.set(x, "gridAutoFlow", js.undefined)
    
    @scala.inline
    def setGridAutoFlowVarargs(value: js.Any*): Self = StObject.set(x, "gridAutoFlow", js.Array(value :_*))
  }
}
