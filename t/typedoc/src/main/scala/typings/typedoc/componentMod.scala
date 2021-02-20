package typings.typedoc

import org.scalablytyped.runtime.Instantiable1
import typings.std.ClassDecorator
import typings.typedoc.applicationMod.Application
import typings.typedoc.optionsDeclarationMod.DeclarationOption
import typings.typedoc.utilsEventsMod.Event
import typings.typedoc.utilsEventsMod.EventDispatcher
import typings.typedoc.utilsEventsMod.EventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentMod {
  
  @JSImport("typedoc/dist/lib/utils/component", "AbstractComponent")
  @js.native
  abstract class AbstractComponent[O /* <: ComponentHost */] protected ()
    extends EventDispatcher
       with ComponentHost {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
    
    var _componentOptions: js.Any = js.native
    
    var _componentOwner: js.Any = js.native
    
    @JSName("application")
    def application_MAbstractComponent: Application = js.native
    
    /* protected */ def bubble(name: String, args: js.Any*): this.type = js.native
    /* protected */ def bubble(name: EventMap, args: js.Any*): this.type = js.native
    /* protected */ def bubble(name: Event, args: js.Any*): this.type = js.native
    
    var componentName: String = js.native
    
    def getOptionDeclarations(): js.Array[DeclarationOption] = js.native
    
    /* protected */ def initialize(): Unit = js.native
    
    def owner: O = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/component", "ChildableComponent")
  @js.native
  abstract class ChildableComponent[O /* <: ComponentHost */, C /* <: Component */] protected () extends AbstractComponent[O] {
    def this(owner: O) = this()
    def this(owner: js.Symbol) = this()
    
    var _componentChildren: js.Any = js.native
    
    var _defaultComponents: js.Any = js.native
    
    def addComponent[T /* <: C */](name: String, componentClass: T): T = js.native
    def addComponent[T /* <: C */](name: String, componentClass: ComponentClass[T, O]): T = js.native
    
    def getComponent(name: String): js.UndefOr[C] = js.native
    
    def getComponents(): js.Array[C] = js.native
    
    def hasComponent(name: String): Boolean = js.native
    
    def removeAllComponents(): Unit = js.native
    
    def removeComponent(name: String): js.UndefOr[C] = js.native
  }
  
  @JSImport("typedoc/dist/lib/utils/component", "Component")
  @js.native
  def Component(options: ComponentOptions): ClassDecorator = js.native
  type Component = AbstractComponent[ComponentHost]
  
  @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent")
  @js.native
  class ComponentEvent protected () extends Event {
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
    @scala.inline
    def ADDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADDED")(x.asInstanceOf[js.Any])
    
    @JSImport("typedoc/dist/lib/utils/component", "ComponentEvent.REMOVED")
    @js.native
    def REMOVED: String = js.native
    @scala.inline
    def REMOVED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REMOVED")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("typedoc/dist/lib/utils/component", "DUMMY_APPLICATION_OWNER")
  @js.native
  val DUMMY_APPLICATION_OWNER: js.Symbol = js.native
  
  @js.native
  trait ComponentClass[T /* <: Component */, O /* <: ComponentHost */]
    extends js.Function
       with Instantiable1[/* owner */ O, T]
  
  @js.native
  trait ComponentHost extends StObject {
    
    val application: Application = js.native
  }
  object ComponentHost {
    
    @scala.inline
    def apply(application: Application): ComponentHost = {
      val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComponentHost]
    }
    
    @scala.inline
    implicit class ComponentHostMutableBuilder[Self <: ComponentHost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: Application): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ComponentOptions extends StObject {
    
    var childClass: js.UndefOr[js.Function] = js.native
    
    var internal: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  object ComponentOptions {
    
    @scala.inline
    def apply(): ComponentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ComponentOptions]
    }
    
    @scala.inline
    implicit class ComponentOptionsMutableBuilder[Self <: ComponentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildClass(value: js.Function): Self = StObject.set(x, "childClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildClassUndefined: Self = StObject.set(x, "childClass", js.undefined)
      
      @scala.inline
      def setInternal(value: Boolean): Self = StObject.set(x, "internal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUndefined: Self = StObject.set(x, "internal", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
}
