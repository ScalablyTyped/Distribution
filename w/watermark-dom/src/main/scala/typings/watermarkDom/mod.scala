package typings.watermarkDom

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("watermark-dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def init(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def load(settings: Settings): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(settings.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def remove(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")().asInstanceOf[Unit]
  
  trait Settings extends StObject {
    
    /**
      * monitor 是否监控， true: 不可删除水印; false: 可删水印。
      */
    var monitor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 水印透明度
      *
      * @description 要求设置在大于等于0.005
      * @default 0.15
      *
      */
    var watermark_alpha: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印倾斜度数
      *
      * @default 15
      */
    var watermark_angle: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印字体颜色
      *
      * @default 水印字体颜色
      */
    var watermark_color: js.UndefOr[String] = js.undefined
    
    /**
      * 水印列数
      *
      * @default 0
      */
    var watermark_cols: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印字体
      *
      * @default 微软雅黑
      */
    var watermark_font: js.UndefOr[String] = js.undefined
    
    /**
      * 水印字体大小
      *
      * @default 18px
      */
    var watermark_fontsize: js.UndefOr[String] = js.undefined
    
    /**
      * 水印长度
      *
      * @default 100
      */
    var watermark_height: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印总体的id
      *
      * @default wm_div_id
      */
    var watermark_id: js.UndefOr[String] = js.undefined
    
    /**
      * 水印的总体高度
      *
      * @default body的scrollHeight和clientHeight的较大值
      */
    var watermark_parent_height: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印插件挂载的父元素element,不输入则默认挂在body上
      */
    var watermark_parent_node: js.UndefOr[Element | Null] = js.undefined
    
    /**
      * 水印的总体宽度
      *
      * @default body的scrollWidth和clientWidth的较大值
      */
    var watermark_parent_width: js.UndefOr[Double] = js.undefined
    
    /**
      * 小水印的id前缀
      *
      * @default mask_div_id
      */
    var watermark_prefix: js.UndefOr[String] = js.undefined
    
    /**
      * 水印行数
      *
      * @default 0
      */
    var watermark_rows: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印的内容
      *
      * @default 测试水印
      */
    var watermark_txt: js.UndefOr[String] = js.undefined
    
    /**
      * 水印宽度
      *
      * @default 100
      */
    var watermark_width: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印起始位置x轴坐标
      *
      * @default 20
      */
    var watermark_x: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印x轴间隔
      *
      * @default 50
      */
    var watermark_x_space: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印起始位置Y轴坐标
      *
      * @default 20
      */
    var watermark_y: js.UndefOr[Double] = js.undefined
    
    /**
      * 水印y轴间隔
      *
      * @default 50
      */
    var watermark_y_space: js.UndefOr[Double] = js.undefined
  }
  object Settings {
    
    inline def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setMonitor(value: Boolean): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
      
      inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
      
      inline def setWatermark_alpha(value: Double): Self = StObject.set(x, "watermark_alpha", value.asInstanceOf[js.Any])
      
      inline def setWatermark_alphaUndefined: Self = StObject.set(x, "watermark_alpha", js.undefined)
      
      inline def setWatermark_angle(value: Double): Self = StObject.set(x, "watermark_angle", value.asInstanceOf[js.Any])
      
      inline def setWatermark_angleUndefined: Self = StObject.set(x, "watermark_angle", js.undefined)
      
      inline def setWatermark_color(value: String): Self = StObject.set(x, "watermark_color", value.asInstanceOf[js.Any])
      
      inline def setWatermark_colorUndefined: Self = StObject.set(x, "watermark_color", js.undefined)
      
      inline def setWatermark_cols(value: Double): Self = StObject.set(x, "watermark_cols", value.asInstanceOf[js.Any])
      
      inline def setWatermark_colsUndefined: Self = StObject.set(x, "watermark_cols", js.undefined)
      
      inline def setWatermark_font(value: String): Self = StObject.set(x, "watermark_font", value.asInstanceOf[js.Any])
      
      inline def setWatermark_fontUndefined: Self = StObject.set(x, "watermark_font", js.undefined)
      
      inline def setWatermark_fontsize(value: String): Self = StObject.set(x, "watermark_fontsize", value.asInstanceOf[js.Any])
      
      inline def setWatermark_fontsizeUndefined: Self = StObject.set(x, "watermark_fontsize", js.undefined)
      
      inline def setWatermark_height(value: Double): Self = StObject.set(x, "watermark_height", value.asInstanceOf[js.Any])
      
      inline def setWatermark_heightUndefined: Self = StObject.set(x, "watermark_height", js.undefined)
      
      inline def setWatermark_id(value: String): Self = StObject.set(x, "watermark_id", value.asInstanceOf[js.Any])
      
      inline def setWatermark_idUndefined: Self = StObject.set(x, "watermark_id", js.undefined)
      
      inline def setWatermark_parent_height(value: Double): Self = StObject.set(x, "watermark_parent_height", value.asInstanceOf[js.Any])
      
      inline def setWatermark_parent_heightUndefined: Self = StObject.set(x, "watermark_parent_height", js.undefined)
      
      inline def setWatermark_parent_node(value: Element): Self = StObject.set(x, "watermark_parent_node", value.asInstanceOf[js.Any])
      
      inline def setWatermark_parent_nodeNull: Self = StObject.set(x, "watermark_parent_node", null)
      
      inline def setWatermark_parent_nodeUndefined: Self = StObject.set(x, "watermark_parent_node", js.undefined)
      
      inline def setWatermark_parent_width(value: Double): Self = StObject.set(x, "watermark_parent_width", value.asInstanceOf[js.Any])
      
      inline def setWatermark_parent_widthUndefined: Self = StObject.set(x, "watermark_parent_width", js.undefined)
      
      inline def setWatermark_prefix(value: String): Self = StObject.set(x, "watermark_prefix", value.asInstanceOf[js.Any])
      
      inline def setWatermark_prefixUndefined: Self = StObject.set(x, "watermark_prefix", js.undefined)
      
      inline def setWatermark_rows(value: Double): Self = StObject.set(x, "watermark_rows", value.asInstanceOf[js.Any])
      
      inline def setWatermark_rowsUndefined: Self = StObject.set(x, "watermark_rows", js.undefined)
      
      inline def setWatermark_txt(value: String): Self = StObject.set(x, "watermark_txt", value.asInstanceOf[js.Any])
      
      inline def setWatermark_txtUndefined: Self = StObject.set(x, "watermark_txt", js.undefined)
      
      inline def setWatermark_width(value: Double): Self = StObject.set(x, "watermark_width", value.asInstanceOf[js.Any])
      
      inline def setWatermark_widthUndefined: Self = StObject.set(x, "watermark_width", js.undefined)
      
      inline def setWatermark_x(value: Double): Self = StObject.set(x, "watermark_x", value.asInstanceOf[js.Any])
      
      inline def setWatermark_xUndefined: Self = StObject.set(x, "watermark_x", js.undefined)
      
      inline def setWatermark_x_space(value: Double): Self = StObject.set(x, "watermark_x_space", value.asInstanceOf[js.Any])
      
      inline def setWatermark_x_spaceUndefined: Self = StObject.set(x, "watermark_x_space", js.undefined)
      
      inline def setWatermark_y(value: Double): Self = StObject.set(x, "watermark_y", value.asInstanceOf[js.Any])
      
      inline def setWatermark_yUndefined: Self = StObject.set(x, "watermark_y", js.undefined)
      
      inline def setWatermark_y_space(value: Double): Self = StObject.set(x, "watermark_y_space", value.asInstanceOf[js.Any])
      
      inline def setWatermark_y_spaceUndefined: Self = StObject.set(x, "watermark_y_space", js.undefined)
    }
  }
}
