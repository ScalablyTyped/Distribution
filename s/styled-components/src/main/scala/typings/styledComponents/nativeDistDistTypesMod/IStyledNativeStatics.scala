package typings.styledComponents.nativeDistDistTypesMod

import typings.std.InstanceType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStyledNativeStatics[OuterProps]
  extends StObject
     with CommonStatics[OuterProps] {
  
  var inlineStyle: InstanceType[IInlineStyleConstructor[OuterProps]]
  
  @JSName("target")
  var target_IStyledNativeStatics: NativeTarget
  
  @JSName("withComponent")
  def withComponent_MIStyledNativeStatics[Target /* <: NativeTarget */, Props](tag: Target): IStyledNativeComponent[Target, OuterProps & Props]
}
object IStyledNativeStatics {
  
  inline def apply[OuterProps](
    attrs: js.Array[Attrs[OuterProps]],
    inlineStyle: InstanceType[IInlineStyleConstructor[OuterProps]],
    target: NativeTarget,
    withComponent: Any => IStyledNativeComponent[Any, OuterProps & Any]
  ): IStyledNativeStatics[OuterProps] = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], inlineStyle = inlineStyle.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], withComponent = js.Any.fromFunction1(withComponent))
    __obj.asInstanceOf[IStyledNativeStatics[OuterProps]]
  }
  
  extension [Self <: IStyledNativeStatics[?], OuterProps](x: Self & IStyledNativeStatics[OuterProps]) {
    
    inline def setInlineStyle(value: InstanceType[IInlineStyleConstructor[OuterProps]]): Self = StObject.set(x, "inlineStyle", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: NativeTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setWithComponent(value: Any => IStyledNativeComponent[Any, OuterProps & Any]): Self = StObject.set(x, "withComponent", js.Any.fromFunction1(value))
  }
}
