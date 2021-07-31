package typings.terminalKit

import typings.terminalKit.anon.DstRect
import typings.terminalKit.terminalMod.Terminal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rectMod {
  
  @JSImport("terminal-kit/Rect", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Rect {
    def this(options: AbsoluteOptions) = this()
    def this(options: Rect) = this()
    def this(options: Region) = this()
    def this(options: typings.terminalKit.screenBufferMod.^) = this()
    def this(options: Terminal) = this()
    def this(options: typings.terminalKit.textBufferMod.^) = this()
    def this(xmin: Double, xmax: Double, ymin: Double, ymax: Double) = this()
    
    /* CompleteClass */
    override def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit = js.native
    
    /* CompleteClass */
    override val height: Double = js.native
    
    /* CompleteClass */
    override val isNull: Boolean = js.native
    
    /* CompleteClass */
    override def set(obj: Region): Unit = js.native
    
    /* CompleteClass */
    override val width: Double = js.native
    
    /* CompleteClass */
    override val xmax: Double = js.native
    
    /* CompleteClass */
    override val xmin: Double = js.native
    
    /* CompleteClass */
    override val ymax: Double = js.native
    
    /* CompleteClass */
    override val ymin: Double = js.native
  }
  @JSImport("terminal-kit/Rect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def wrappingRect(params: DstRect): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("wrappingRect")(params.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait AbsoluteOptions
    extends StObject
       with Options {
    
    var height: Double
    
    var width: Double
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object AbsoluteOptions {
    
    @scala.inline
    def apply(height: Double, width: Double): AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[AbsoluteOptions]
    }
    
    @scala.inline
    implicit class AbsoluteOptionsMutableBuilder[Self <: AbsoluteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.terminalKit.rectMod.AbsoluteOptions
    - typings.terminalKit.rectMod.Region
  */
  trait Options extends StObject
  object Options {
    
    @scala.inline
    def AbsoluteOptions(height: Double, width: Double): typings.terminalKit.rectMod.AbsoluteOptions = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.terminalKit.rectMod.AbsoluteOptions]
    }
    
    @scala.inline
    def Region(xmax: Double, xmin: Double, ymax: Double, ymin: Double): typings.terminalKit.rectMod.Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.terminalKit.rectMod.Region]
    }
  }
  
  trait Rect extends StObject {
    
    def clip(dstRect: Rect, offsetX: Double, offsetY: Double, dstClipping: Boolean): Unit
    
    val height: Double
    
    val isNull: Boolean
    
    def set(obj: Region): Unit
    
    val width: Double
    
    val xmax: Double
    
    val xmin: Double
    
    val ymax: Double
    
    val ymin: Double
  }
  object Rect {
    
    @scala.inline
    def apply(
      clip: (Rect, Double, Double, Boolean) => Unit,
      height: Double,
      isNull: Boolean,
      set: Region => Unit,
      width: Double,
      xmax: Double,
      xmin: Double,
      ymax: Double,
      ymin: Double
    ): Rect = {
      val __obj = js.Dynamic.literal(clip = js.Any.fromFunction4(clip), height = height.asInstanceOf[js.Any], isNull = isNull.asInstanceOf[js.Any], set = js.Any.fromFunction1(set), width = width.asInstanceOf[js.Any], xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rect]
    }
    
    @scala.inline
    implicit class RectMutableBuilder[Self <: Rect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClip(value: (Rect, Double, Double, Boolean) => Unit): Self = StObject.set(x, "clip", js.Any.fromFunction4(value))
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNull(value: Boolean): Self = StObject.set(x, "isNull", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: Region => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
  
  trait Region
    extends StObject
       with Options {
    
    var xmax: Double
    
    var xmin: Double
    
    var ymax: Double
    
    var ymin: Double
  }
  object Region {
    
    @scala.inline
    def apply(xmax: Double, xmin: Double, ymax: Double, ymin: Double): Region = {
      val __obj = js.Dynamic.literal(xmax = xmax.asInstanceOf[js.Any], xmin = xmin.asInstanceOf[js.Any], ymax = ymax.asInstanceOf[js.Any], ymin = ymin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Region]
    }
    
    @scala.inline
    implicit class RegionMutableBuilder[Self <: Region] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXmax(value: Double): Self = StObject.set(x, "xmax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXmin(value: Double): Self = StObject.set(x, "xmin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmax(value: Double): Self = StObject.set(x, "ymax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYmin(value: Double): Self = StObject.set(x, "ymin", value.asInstanceOf[js.Any])
    }
  }
}
