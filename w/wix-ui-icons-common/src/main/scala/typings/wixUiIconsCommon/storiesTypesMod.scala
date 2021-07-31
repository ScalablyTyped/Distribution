package typings.wixUiIconsCommon

import typings.fuseJs.mod.FuseOptions
import typings.fuseJs.mod.^
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.SVGAttributes
import typings.std.SVGElement
import typings.wixUiIconsCommon.typesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object storiesTypesMod {
  
  trait Category extends StObject {
    
    var iconsMetadata: js.Array[IconMetadata]
    
    var title: String
  }
  object Category {
    
    @scala.inline
    def apply(iconsMetadata: js.Array[IconMetadata], title: String): Category = {
      val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type CategoryTableRow = js.Array[ReactNode]
  
  type GeneralTableRow = js.Tuple5[ReactNode, js.UndefOr[String], ReactNode, js.UndefOr[String], js.UndefOr[String]]
  
  trait IconDescriptor extends StObject {
    
    var Icon: FC[IconProps]
    
    var name: String
    
    var size: String
  }
  object IconDescriptor {
    
    @scala.inline
    def apply(Icon: FC[IconProps], name: String, size: String): IconDescriptor = {
      val __obj = js.Dynamic.literal(Icon = Icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDescriptor]
    }
    
    @scala.inline
    implicit class IconDescriptorMutableBuilder[Self <: IconDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: FC[IconProps]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.undefined
  }
  object IconProps {
    
    @scala.inline
    def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type IconsMetadataIndex = ^[IconMetadata, FuseOptions[IconMetadata]]
  
  type SystemTableRow = js.Tuple3[String, ReactNode, js.UndefOr[String]]
}
