package typings.typedoc

import org.scalablytyped.runtime.Instantiable1
import typings.std.ClassDecorator
import typings.typedoc.applicationMod.Application
import typings.typedoc.utilsEventsMod.Event
import typings.typedoc.utilsEventsMod.EventDispatcher
import typings.typedoc.utilsEventsMod.EventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("typedoc/dist/lib/utils/component", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/component", "AbstractComponent")
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends EventDispatcher
       with ComponentHost {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
    
    /**
      * The owner of this component instance.
      */
    /* private */ var _componentOwner: Any = js.native
    
    /* CompleteClass */
    override val application: Application = js.native
    /**
      * Return the application / root component instance.
      */
    @JSName("application")
    def application_MAbstractComponent: Application = js.native
    
    /* protected */ def bubble(name: String, args: Any*): this.type = js.native
    /* protected */ def bubble(name: EventMap, args: Any*): this.type = js.native
    /* protected */ def bubble(name: Event, args: Any*): this.type = js.native
    
    /**
      * The name of this component as set by the @Component decorator.
      */
    var componentName: String = js.native
    
    /**
      * Initialize this component.
      */
    /* protected */ def initialize(): Unit = js.native
    
    /**
      * Return the owner of this component.
      */
    def owner: O = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/component", "ChildableComponent")
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected () extends AbstractComponent[O] {
    /**
      * Create new Component instance.
      */
    def this(owner: O) = this()
    
    /**
      *
      */
    /* private */ var _componentChildren: Any = js.native
    
    /* private */ var _defaultComponents: Any = js.native
    
    def addComponent[T /* <: C */](name: String, componentClass: T): T = js.native
    def addComponent[T /* <: C */](name: String, componentClass: ComponentClass[T, O]): T = js.native
    
    /**
      * Retrieve a plugin instance.
      *
      * @returns  The instance of the plugin or undefined if no plugin with the given class is attached.
      */
    def getComponent(name: String): js.UndefOr[C] = js.native
    
    def getComponents(): js.Array[C] = js.native
    
    def hasComponent(name: String): Boolean = js.native
    
    def removeAllComponents(): Unit = js.native
    
    def removeComponent(name: String): js.UndefOr[C] = js.native
  }
  
  inline def Component(options: ComponentOptions): ClassDecorator = ^.asInstanceOf[js.Dynamic].applyDynamic("Component")(options.asInstanceOf[js.Any]).asInstanceOf[ClassDecorator]
  type Component = AbstractComponent[ComponentHost]
  
  @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
  @js.native
  open class ComponentEvent protected () extends Event {
    def this(name: String, owner: ComponentHost, component: AbstractComponent[ComponentHost]) = this()
    
    var component: AbstractComponent[ComponentHost] = js.native
    
    var owner: ComponentHost = js.native
  }
  /* static members */
  object ComponentEvent {
    
    @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent.ADDED")
    @js.native
    def ADDED: String = js.native
    inline def ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent.REMOVED")
    @js.native
    def REMOVED: String = js.native
    inline def REMOVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ComponentClass[T /* <: Component */, O /* <: ComponentHost */]
    extends js.Function
       with Instantiable1[/* owner */ O, T]
  
  trait ComponentHost extends StObject {
    
    val application: Application
  }
  object ComponentHost {
    
    inline def apply(application: Application): ComponentHost = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentHost]
    }
    
    extension [Self <: ComponentHost](x: Self) {
      
      inline def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
  
  trait ComponentOptions extends StObject {
    
    /** Specify valid child component class.  Used to prove that children are valid via `instanceof` checks */
    var childClass: js.UndefOr[js.Function] = js.undefined
    
    var internal: js.UndefOr[Boolean] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object ComponentOptions {
    
    inline def apply(): ComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions]
    }
    
    extension [Self <: ComponentOptions](x: Self) {
      
      inline def setChildClass(value: js.Function): Self = StObject.set(x, "childClass", value.asInstanceOf[js.Any])
      
      inline def setChildClassUndefined: Self = StObject.set(x, "childClass", js.undefined)
      
      inline def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      inline def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
