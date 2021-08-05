package typings.uifabricStyling

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import typings.uifabricMergeStyles.irawstyleMod.IRawStyle
import typings.uifabricMergeStyles.irawstylebaseMod.IFontFace
import typings.uifabricStyling.anon.PartialIIconOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconsMod {
  
  @JSImport("@uifabric/styling/lib/utilities/icons", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIcon(): js.UndefOr[IIconRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")().asInstanceOf[js.UndefOr[IIconRecord]]
  inline def getIcon(name: String): js.UndefOr[IIconRecord] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIcon")(name.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IIconRecord]]
  
  inline def registerIconAlias(iconName: String, mappedToName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIconAlias")(iconName.asInstanceOf[js.Any], mappedToName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerIcons(iconSubset: IIconSubset): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerIcons")(iconSubset.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerIcons(iconSubset: IIconSubset, options: PartialIIconOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerIcons")(iconSubset.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setIconOptions(options: PartialIIconOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setIconOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def unregisterIcons(iconNames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unregisterIcons")(iconNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IIconOptions extends StObject {
    
    /**
      * By default, registering the same set of icons will generate a console warning per duplicate icon
      * registered, because this scenario can create unexpected consequences.
      *
      * Some scenarios include:
      *
      * Icon set was previously registered using a different base url.
      * Icon set was previously registered but a different version was provided.
      * Icons in a previous registered set overlap with a new set.
      *
      * To simply ignore previously registered icons, you can specify to disable warnings. This means
      * that if an icon which was previous registered is registered again, it will be silently ignored.
      * However, consider whether the problems listed above will cause issues.
      **/
    var disableWarnings: Boolean
    
    /**
      * @deprecated
      * Use 'disableWarnings' instead.
      */
    var warnOnMissingIcons: js.UndefOr[Boolean] = js.undefined
  }
  object IIconOptions {
    
    inline def apply(disableWarnings: Boolean): IIconOptions = {
      val __obj = js.Dynamic.literal(disableWarnings = disableWarnings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconOptions]
    }
    
    extension [Self <: IIconOptions](x: Self) {
      
      inline def setDisableWarnings(value: Boolean): Self = StObject.set(x, "disableWarnings", value.asInstanceOf[js.Any])
      
      inline def setWarnOnMissingIcons(value: Boolean): Self = StObject.set(x, "warnOnMissingIcons", value.asInstanceOf[js.Any])
      
      inline def setWarnOnMissingIconsUndefined: Self = StObject.set(x, "warnOnMissingIcons", js.undefined)
    }
  }
  
  trait IIconRecord extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var subset: IIconSubsetRecord
  }
  object IIconRecord {
    
    inline def apply(subset: IIconSubsetRecord): IIconRecord = {
      val __obj = js.Dynamic.literal(subset = subset.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconRecord]
    }
    
    extension [Self <: IIconRecord](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setSubset(value: IIconSubsetRecord): Self = StObject.set(x, "subset", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIconRecords
    extends StObject
       with /* key */ StringDictionary[IIconRecord | js.Object] {
    
    var __options: IIconOptions
    
    var __remapped: StringDictionary[String]
  }
  object IIconRecords {
    
    inline def apply(__options: IIconOptions, __remapped: StringDictionary[String]): IIconRecords = {
      val __obj = js.Dynamic.literal(__options = __options.asInstanceOf[js.Any], __remapped = __remapped.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconRecords]
    }
    
    extension [Self <: IIconRecords](x: Self) {
      
      inline def set__options(value: IIconOptions): Self = StObject.set(x, "__options", value.asInstanceOf[js.Any])
      
      inline def set__remapped(value: StringDictionary[String]): Self = StObject.set(x, "__remapped", value.asInstanceOf[js.Any])
    }
  }
  
  trait IIconSubset extends StObject {
    
    var fontFace: js.UndefOr[IFontFace] = js.undefined
    
    var icons: StringDictionary[String | Element]
    
    var style: js.UndefOr[IRawStyle] = js.undefined
  }
  object IIconSubset {
    
    inline def apply(icons: StringDictionary[String | Element]): IIconSubset = {
      val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconSubset]
    }
    
    extension [Self <: IIconSubset](x: Self) {
      
      inline def setFontFace(value: IFontFace): Self = StObject.set(x, "fontFace", value.asInstanceOf[js.Any])
      
      inline def setFontFaceUndefined: Self = StObject.set(x, "fontFace", js.undefined)
      
      inline def setIcons(value: StringDictionary[String | Element]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: IRawStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait IIconSubsetRecord
    extends StObject
       with IIconSubset {
    
    var className: js.UndefOr[String] = js.undefined
    
    var isRegistered: js.UndefOr[Boolean] = js.undefined
  }
  object IIconSubsetRecord {
    
    inline def apply(icons: StringDictionary[String | Element]): IIconSubsetRecord = {
      val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
      __obj.asInstanceOf[IIconSubsetRecord]
    }
    
    extension [Self <: IIconSubsetRecord](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setIsRegistered(value: Boolean): Self = StObject.set(x, "isRegistered", value.asInstanceOf[js.Any])
      
      inline def setIsRegisteredUndefined: Self = StObject.set(x, "isRegistered", js.undefined)
    }
  }
}
