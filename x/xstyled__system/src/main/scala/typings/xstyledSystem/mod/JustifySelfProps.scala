package typings.xstyledSystem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JustifySelfProps extends StObject {
  
  val justifySelf: js.UndefOr[
    ResponsiveValue[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
    ]
  ] = js.native
}
object JustifySelfProps {
  
  @scala.inline
  def apply(): JustifySelfProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JustifySelfProps]
  }
  
  @scala.inline
  implicit class JustifySelfPropsMutableBuilder[Self <: JustifySelfProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJustifySelf(
      value: ResponsiveValue[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSS.Property.JustifySelf */ _
        ]
    ): Self = StObject.set(x, "justifySelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJustifySelfUndefined: Self = StObject.set(x, "justifySelf", js.undefined)
    
    @scala.inline
    def setJustifySelfVarargs(value: js.Any*): Self = StObject.set(x, "justifySelf", js.Array(value :_*))
  }
}
