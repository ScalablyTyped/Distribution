package typings.wixWixUiIconsCommon

import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.react.mod.SVGAttributes
import typings.std.Record
import typings.std.SVGElement
import typings.wixWixUiIconsCommon.distTypesTypesMod.IconMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesStoriesTypesMod {
  
  trait Category extends StObject {
    
    var iconsMetadata: js.Array[IconMetadata]
    
    var title: String
  }
  object Category {
    
    inline def apply(iconsMetadata: js.Array[IconMetadata], title: String): Category = {
      val __obj = js.Dynamic.literal(iconsMetadata = iconsMetadata.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type CategoryTableRow = js.Array[ReactNode]
  
  trait GeneralCategoryListProps extends StObject {
    
    var iconComponents: Record[String, FC[IconProps]]
    
    var iconSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    var iconsMetadata: js.Array[IconMetadata]
  }
  object GeneralCategoryListProps {
    
    inline def apply(iconComponents: Record[String, FC[IconProps]], iconsMetadata: js.Array[IconMetadata]): GeneralCategoryListProps = {
      val __obj = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any], iconsMetadata = iconsMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneralCategoryListProps]
    }
    
    extension [Self <: GeneralCategoryListProps](x: Self) {
      
      inline def setIconComponents(value: Record[String, FC[IconProps]]): Self = StObject.set(x, "iconComponents", value.asInstanceOf[js.Any])
      
      inline def setIconSizes(value: js.Array[Double]): Self = StObject.set(x, "iconSizes", value.asInstanceOf[js.Any])
      
      inline def setIconSizesUndefined: Self = StObject.set(x, "iconSizes", js.undefined)
      
      inline def setIconSizesVarargs(value: Double*): Self = StObject.set(x, "iconSizes", js.Array(value*))
      
      inline def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value*))
    }
  }
  
  trait IconDescriptor extends StObject {
    
    var Icon: FC[IconProps]
    
    var name: String
    
    var size: String
  }
  object IconDescriptor {
    
    inline def apply(Icon: FC[IconProps], name: String, size: String): IconDescriptor = {
      val __obj = js.Dynamic.literal(Icon = Icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDescriptor]
    }
    
    extension [Self <: IconDescriptor](x: Self) {
      
      inline def setIcon(value: FC[IconProps]): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IconProps {
    
    inline def apply(): IconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type IconsMetadataIndex = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Fuse<IconMetadata> */ Any
  
  trait SystemCategoryListProps extends StObject {
    
    var iconComponents: Record[String, FC[IconProps]]
    
    var iconsMetadata: js.Array[IconMetadata]
  }
  object SystemCategoryListProps {
    
    inline def apply(iconComponents: Record[String, FC[IconProps]], iconsMetadata: js.Array[IconMetadata]): SystemCategoryListProps = {
      val __obj = js.Dynamic.literal(iconComponents = iconComponents.asInstanceOf[js.Any], iconsMetadata = iconsMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemCategoryListProps]
    }
    
    extension [Self <: SystemCategoryListProps](x: Self) {
      
      inline def setIconComponents(value: Record[String, FC[IconProps]]): Self = StObject.set(x, "iconComponents", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadata(value: js.Array[IconMetadata]): Self = StObject.set(x, "iconsMetadata", value.asInstanceOf[js.Any])
      
      inline def setIconsMetadataVarargs(value: IconMetadata*): Self = StObject.set(x, "iconsMetadata", js.Array(value*))
    }
  }
  
  type SystemTableRow = js.Tuple3[String, ReactNode, js.UndefOr[String]]
}
