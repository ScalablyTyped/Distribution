package typings.sumoselect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  placeholder :string,   csvDispCount :number,   captionFormat :string,   captionFormatAllSelected :string,   floatWidth :number,   forceCustomRendering :boolean,   nativeOnDevice :std.Array<string>,   outputAsCSV :boolean,   csvSepChar :string,   okCancelInMulti :boolean,   isClickAwayOk :boolean,   triggerChangeCombined :boolean,   selectAll :boolean,   search :boolean,   searchText :string, searchFn (haystack : string, needle : string): boolean,   noMatch :string,   prefix :string,   locale :std.Array<string>,   up :boolean,   showTitle :boolean,   max :number | null, renderLi (li : sumoselect.JQuery, originalOption : sumoselect.JQuery): sumoselect.JQuery}> */
trait Option extends StObject {
  
  var captionFormat: js.UndefOr[String] = js.undefined
  
  var captionFormatAllSelected: js.UndefOr[String] = js.undefined
  
  var csvDispCount: js.UndefOr[Double] = js.undefined
  
  var csvSepChar: js.UndefOr[String] = js.undefined
  
  var floatWidth: js.UndefOr[Double] = js.undefined
  
  var forceCustomRendering: js.UndefOr[Boolean] = js.undefined
  
  var isClickAwayOk: js.UndefOr[Boolean] = js.undefined
  
  var locale: js.UndefOr[js.Array[String]] = js.undefined
  
  var max: js.UndefOr[Double | Null] = js.undefined
  
  var nativeOnDevice: js.UndefOr[js.Array[String]] = js.undefined
  
  var noMatch: js.UndefOr[String] = js.undefined
  
  var okCancelInMulti: js.UndefOr[Boolean] = js.undefined
  
  var outputAsCSV: js.UndefOr[Boolean] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var renderLi: js.UndefOr[js.Function2[/* li */ JQuery, /* originalOption */ JQuery, JQuery]] = js.undefined
  
  var search: js.UndefOr[Boolean] = js.undefined
  
  var searchFn: js.UndefOr[js.Function2[/* haystack */ String, /* needle */ String, Boolean]] = js.undefined
  
  var searchText: js.UndefOr[String] = js.undefined
  
  var selectAll: js.UndefOr[Boolean] = js.undefined
  
  var showTitle: js.UndefOr[Boolean] = js.undefined
  
  var triggerChangeCombined: js.UndefOr[Boolean] = js.undefined
  
  var up: js.UndefOr[Boolean] = js.undefined
}
object Option {
  
  inline def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
    
    inline def setCaptionFormat(value: String): Self = StObject.set(x, "captionFormat", value.asInstanceOf[js.Any])
    
    inline def setCaptionFormatAllSelected(value: String): Self = StObject.set(x, "captionFormatAllSelected", value.asInstanceOf[js.Any])
    
    inline def setCaptionFormatAllSelectedUndefined: Self = StObject.set(x, "captionFormatAllSelected", js.undefined)
    
    inline def setCaptionFormatUndefined: Self = StObject.set(x, "captionFormat", js.undefined)
    
    inline def setCsvDispCount(value: Double): Self = StObject.set(x, "csvDispCount", value.asInstanceOf[js.Any])
    
    inline def setCsvDispCountUndefined: Self = StObject.set(x, "csvDispCount", js.undefined)
    
    inline def setCsvSepChar(value: String): Self = StObject.set(x, "csvSepChar", value.asInstanceOf[js.Any])
    
    inline def setCsvSepCharUndefined: Self = StObject.set(x, "csvSepChar", js.undefined)
    
    inline def setFloatWidth(value: Double): Self = StObject.set(x, "floatWidth", value.asInstanceOf[js.Any])
    
    inline def setFloatWidthUndefined: Self = StObject.set(x, "floatWidth", js.undefined)
    
    inline def setForceCustomRendering(value: Boolean): Self = StObject.set(x, "forceCustomRendering", value.asInstanceOf[js.Any])
    
    inline def setForceCustomRenderingUndefined: Self = StObject.set(x, "forceCustomRendering", js.undefined)
    
    inline def setIsClickAwayOk(value: Boolean): Self = StObject.set(x, "isClickAwayOk", value.asInstanceOf[js.Any])
    
    inline def setIsClickAwayOkUndefined: Self = StObject.set(x, "isClickAwayOk", js.undefined)
    
    inline def setLocale(value: js.Array[String]): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setLocaleVarargs(value: String*): Self = StObject.set(x, "locale", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxNull: Self = StObject.set(x, "max", null)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setNativeOnDevice(value: js.Array[String]): Self = StObject.set(x, "nativeOnDevice", value.asInstanceOf[js.Any])
    
    inline def setNativeOnDeviceUndefined: Self = StObject.set(x, "nativeOnDevice", js.undefined)
    
    inline def setNativeOnDeviceVarargs(value: String*): Self = StObject.set(x, "nativeOnDevice", js.Array(value*))
    
    inline def setNoMatch(value: String): Self = StObject.set(x, "noMatch", value.asInstanceOf[js.Any])
    
    inline def setNoMatchUndefined: Self = StObject.set(x, "noMatch", js.undefined)
    
    inline def setOkCancelInMulti(value: Boolean): Self = StObject.set(x, "okCancelInMulti", value.asInstanceOf[js.Any])
    
    inline def setOkCancelInMultiUndefined: Self = StObject.set(x, "okCancelInMulti", js.undefined)
    
    inline def setOutputAsCSV(value: Boolean): Self = StObject.set(x, "outputAsCSV", value.asInstanceOf[js.Any])
    
    inline def setOutputAsCSVUndefined: Self = StObject.set(x, "outputAsCSV", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRenderLi(value: (/* li */ JQuery, /* originalOption */ JQuery) => JQuery): Self = StObject.set(x, "renderLi", js.Any.fromFunction2(value))
    
    inline def setRenderLiUndefined: Self = StObject.set(x, "renderLi", js.undefined)
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchFn(value: (/* haystack */ String, /* needle */ String) => Boolean): Self = StObject.set(x, "searchFn", js.Any.fromFunction2(value))
    
    inline def setSearchFnUndefined: Self = StObject.set(x, "searchFn", js.undefined)
    
    inline def setSearchText(value: String): Self = StObject.set(x, "searchText", value.asInstanceOf[js.Any])
    
    inline def setSearchTextUndefined: Self = StObject.set(x, "searchText", js.undefined)
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    
    inline def setSelectAll(value: Boolean): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setShowTitle(value: Boolean): Self = StObject.set(x, "showTitle", value.asInstanceOf[js.Any])
    
    inline def setShowTitleUndefined: Self = StObject.set(x, "showTitle", js.undefined)
    
    inline def setTriggerChangeCombined(value: Boolean): Self = StObject.set(x, "triggerChangeCombined", value.asInstanceOf[js.Any])
    
    inline def setTriggerChangeCombinedUndefined: Self = StObject.set(x, "triggerChangeCombined", js.undefined)
    
    inline def setUp(value: Boolean): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
