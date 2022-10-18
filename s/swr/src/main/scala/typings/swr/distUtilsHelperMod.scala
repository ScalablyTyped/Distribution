package typings.swr

import typings.std.Object
import typings.std.ObjectConstructor
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsHelperMod {
  
  @JSImport("swr/dist/utils/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("swr/dist/utils/helper", "OBJECT")
  @js.native
  /* standard es5 */
  open class OBJECT ()
    extends StObject
       with Object {
    def this(value: Any) = this()
    
    /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
    /* standard es5 */
    /* CompleteClass */
    var constructor: js.Function = js.native
    
    /**
      * Determines whether an object has a property with the specified name.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def hasOwnProperty(v: PropertyKey): Boolean = js.native
    
    /**
      * Determines whether a specified property is enumerable.
      * @param v A property name.
      */
    /* standard es5 */
    /* CompleteClass */
    override def propertyIsEnumerable(v: PropertyKey): Boolean = js.native
  }
  @JSImport("swr/dist/utils/helper", "OBJECT")
  @js.native
  val OBJECT: ObjectConstructor = js.native
  
  @JSImport("swr/dist/utils/helper", "UNDEFINED")
  @js.native
  val UNDEFINED: /* undefined */ Any = js.native
  
  inline def hasDocument(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasDocument")().asInstanceOf[Boolean]
  
  inline def hasRequestAnimationFrame(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasRequestAnimationFrame")().asInstanceOf[Boolean]
  
  inline def hasWindow(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasWindow")().asInstanceOf[Boolean]
  
  inline def isFunction(v: Any): /* is std.Function */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(v.asInstanceOf[js.Any]).asInstanceOf[/* is std.Function */ Boolean]
  
  inline def isUndefined(v: Any): /* is undefined */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUndefined")(v.asInstanceOf[js.Any]).asInstanceOf[/* is undefined */ Boolean]
  
  inline def mergeObjects(a: Any, b: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def noop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Unit]
}
