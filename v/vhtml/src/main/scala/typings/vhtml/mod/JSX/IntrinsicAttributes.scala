package typings.vhtml.mod.JSX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntrinsicAttributes extends StObject {
  
  // This property is not used by vhtml, but is required to enforce
  // type checking of function components that accept no children.
  //
  // To explain: TypeScript checks JSX attributes (and children,
  // apprently) as though they are object literal assignments for a
  // component's props.
  // The only information I could find about this behavior was this:
  //  - https://github.com/microsoft/TypeScript/issues/15463#issuecomment-299263157
  //
  // If this property did not exist, TypeScript would treat this
  // interface as the empty object type (`{}`). Since TypeScript
  // allows objects with arbitrary attributes to be assigned to the
  // empty object type, it would allow `{ children: any }` to be
  // passed to a component, even if the component was childless.
  // Defining this dummy property prevents this behavior, so that
  // passing children to a childless component would correctly cause a
  // type error.
  //
  // Note that other JSX frameworks like React do not need this hack
  // because they use actual intrinsic properties, such as `key`.
  var __dummy_dont_use: js.UndefOr[Any] = js.undefined
}
object IntrinsicAttributes {
  
  inline def apply(): IntrinsicAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IntrinsicAttributes]
  }
  
  extension [Self <: IntrinsicAttributes](x: Self) {
    
    inline def set__dummy_dont_use(value: Any): Self = StObject.set(x, "__dummy_dont_use", value.asInstanceOf[js.Any])
    
    inline def set__dummy_dont_useUndefined: Self = StObject.set(x, "__dummy_dont_use", js.undefined)
  }
}
