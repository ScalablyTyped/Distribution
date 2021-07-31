package typings.vueSplitpane

import org.scalablytyped.runtime.Shortcut
import typings.std.Event
import typings.vue.vueMod.Vue
import typings.vue.vueMod.VueConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("vue-splitpane", JSImport.Default)
  @js.native
  val default: SplitpaneConstructor = js.native
  
  @JSImport("vue-splitpane", "Splitpane")
  @js.native
  val Splitpane: SplitpaneConstructor = js.native
  
  trait SplitpaneComputed extends StObject {
    
    def cursor(): String
    
    def userSelect(): String
  }
  object SplitpaneComputed {
    
    @scala.inline
    def apply(cursor: () => String, userSelect: () => String): SplitpaneComputed = {
      val __obj = js.Dynamic.literal(cursor = js.Any.fromFunction0(cursor), userSelect = js.Any.fromFunction0(userSelect))
      __obj.asInstanceOf[SplitpaneComputed]
    }
    
    @scala.inline
    implicit class SplitpaneComputedMutableBuilder[Self <: SplitpaneComputed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCursor(value: () => String): Self = StObject.set(x, "cursor", js.Any.fromFunction0(value))
      
      @scala.inline
      def setUserSelect(value: () => String): Self = StObject.set(x, "userSelect", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait SplitpaneConstructor
    extends StObject
       with VueConstructor[Vue] {
    
    var computed: SplitpaneComputed = js.native
    
    def data(): SplitpaneData = js.native
    
    var methods: SplitpaneMethods = js.native
    
    var props: SplitpaneProps = js.native
    
    var watch: SplitpaneWatch = js.native
  }
  
  trait SplitpaneData extends StObject {
    
    var active: Boolean
    
    var hasMoved: Boolean
    
    var height: js.Any
    
    // null number string
    var percent: Double
    
    var resizeType: String
    
    var `type`: String
  }
  object SplitpaneData {
    
    @scala.inline
    def apply(
      active: Boolean,
      hasMoved: Boolean,
      height: js.Any,
      percent: Double,
      resizeType: String,
      `type`: String
    ): SplitpaneData = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], hasMoved = hasMoved.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], resizeType = resizeType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitpaneData]
    }
    
    @scala.inline
    implicit class SplitpaneDataMutableBuilder[Self <: SplitpaneData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoved(value: Boolean): Self = StObject.set(x, "hasMoved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeType(value: String): Self = StObject.set(x, "resizeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitpaneMethods extends StObject {
    
    def onClick(): Unit
    
    def onMouseDown(): Unit
    
    def onMouseMove(e: Event): Unit
    
    def onMouseUp(): Unit
  }
  object SplitpaneMethods {
    
    @scala.inline
    def apply(onClick: () => Unit, onMouseDown: () => Unit, onMouseMove: Event => Unit, onMouseUp: () => Unit): SplitpaneMethods = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), onMouseDown = js.Any.fromFunction0(onMouseDown), onMouseMove = js.Any.fromFunction1(onMouseMove), onMouseUp = js.Any.fromFunction0(onMouseUp))
      __obj.asInstanceOf[SplitpaneMethods]
    }
    
    @scala.inline
    implicit class SplitpaneMethodsMutableBuilder[Self <: SplitpaneMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseDown(value: () => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseMove(value: Event => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUp(value: () => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction0(value))
    }
  }
  
  trait SplitpaneProps extends StObject {
    
    // = ['vertical', 'horizontal']
    var className: String
    
    var defaultPercent: Double
    
    var minPercent: Double
    
    var split: String
  }
  object SplitpaneProps {
    
    @scala.inline
    def apply(className: String, defaultPercent: Double, minPercent: Double, split: String): SplitpaneProps = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], defaultPercent = defaultPercent.asInstanceOf[js.Any], minPercent = minPercent.asInstanceOf[js.Any], split = split.asInstanceOf[js.Any])
      __obj.asInstanceOf[SplitpaneProps]
    }
    
    @scala.inline
    implicit class SplitpanePropsMutableBuilder[Self <: SplitpaneProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPercent(value: Double): Self = StObject.set(x, "defaultPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinPercent(value: Double): Self = StObject.set(x, "minPercent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
    }
  }
  
  trait SplitpaneWatch extends StObject {
    
    def defaultPercent(`val`: js.Any): Unit
  }
  object SplitpaneWatch {
    
    @scala.inline
    def apply(defaultPercent: js.Any => Unit): SplitpaneWatch = {
      val __obj = js.Dynamic.literal(defaultPercent = js.Any.fromFunction1(defaultPercent))
      __obj.asInstanceOf[SplitpaneWatch]
    }
    
    @scala.inline
    implicit class SplitpaneWatchMutableBuilder[Self <: SplitpaneWatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPercent(value: js.Any => Unit): Self = StObject.set(x, "defaultPercent", js.Any.fromFunction1(value))
    }
  }
  
  type _To = SplitpaneConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: SplitpaneConstructor = default
}
