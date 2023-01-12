package typings.webpack.mod

import typings.webpack.webpackStrings.child
import typings.webpack.webpackStrings.parent
import typings.webpack.webpackStrings.sibling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnownStatsPrinterContext extends StObject {
  
  var asset: js.UndefOr[StatsAsset] = js.undefined
  
  var bold: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  var chunk: js.UndefOr[StatsChunk] = js.undefined
  
  var chunkGroup: js.UndefOr[StatsChunkGroup] = js.undefined
  
  var chunkGroupKind: js.UndefOr[String] = js.undefined
  
  var compilation: js.UndefOr[StatsCompilation] = js.undefined
  
  var cyan: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  var formatChunkId: js.UndefOr[
    js.Function2[/* id */ String, /* direction */ js.UndefOr[parent | child | sibling], String]
  ] = js.undefined
  
  var formatDateTime: js.UndefOr[js.Function1[/* dateTime */ Double, String]] = js.undefined
  
  var formatFilename: js.UndefOr[js.Function2[/* file */ String, /* oversize */ js.UndefOr[Boolean], String]] = js.undefined
  
  var formatFlag: js.UndefOr[js.Function1[/* flag */ String, String]] = js.undefined
  
  var formatModuleId: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  
  var formatSize: js.UndefOr[js.Function1[/* size */ Double, String]] = js.undefined
  
  var formatTime: js.UndefOr[js.Function2[/* time */ Double, /* boldQuantity */ js.UndefOr[Boolean], String]] = js.undefined
  
  var green: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  var magenta: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  var module: js.UndefOr[StatsModule] = js.undefined
  
  var moduleReason: js.UndefOr[StatsModuleReason] = js.undefined
  
  var red: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
  
  var yellow: js.UndefOr[js.Function1[/* str */ String, String]] = js.undefined
}
object KnownStatsPrinterContext {
  
  inline def apply(): KnownStatsPrinterContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KnownStatsPrinterContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnownStatsPrinterContext] (val x: Self) extends AnyVal {
    
    inline def setAsset(value: StatsAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    inline def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
    
    inline def setBold(value: /* str */ String => String): Self = StObject.set(x, "bold", js.Any.fromFunction1(value))
    
    inline def setBoldUndefined: Self = StObject.set(x, "bold", js.undefined)
    
    inline def setChunk(value: StatsChunk): Self = StObject.set(x, "chunk", value.asInstanceOf[js.Any])
    
    inline def setChunkGroup(value: StatsChunkGroup): Self = StObject.set(x, "chunkGroup", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupKind(value: String): Self = StObject.set(x, "chunkGroupKind", value.asInstanceOf[js.Any])
    
    inline def setChunkGroupKindUndefined: Self = StObject.set(x, "chunkGroupKind", js.undefined)
    
    inline def setChunkGroupUndefined: Self = StObject.set(x, "chunkGroup", js.undefined)
    
    inline def setChunkUndefined: Self = StObject.set(x, "chunk", js.undefined)
    
    inline def setCompilation(value: StatsCompilation): Self = StObject.set(x, "compilation", value.asInstanceOf[js.Any])
    
    inline def setCompilationUndefined: Self = StObject.set(x, "compilation", js.undefined)
    
    inline def setCyan(value: /* str */ String => String): Self = StObject.set(x, "cyan", js.Any.fromFunction1(value))
    
    inline def setCyanUndefined: Self = StObject.set(x, "cyan", js.undefined)
    
    inline def setFormatChunkId(value: (/* id */ String, /* direction */ js.UndefOr[parent | child | sibling]) => String): Self = StObject.set(x, "formatChunkId", js.Any.fromFunction2(value))
    
    inline def setFormatChunkIdUndefined: Self = StObject.set(x, "formatChunkId", js.undefined)
    
    inline def setFormatDateTime(value: /* dateTime */ Double => String): Self = StObject.set(x, "formatDateTime", js.Any.fromFunction1(value))
    
    inline def setFormatDateTimeUndefined: Self = StObject.set(x, "formatDateTime", js.undefined)
    
    inline def setFormatFilename(value: (/* file */ String, /* oversize */ js.UndefOr[Boolean]) => String): Self = StObject.set(x, "formatFilename", js.Any.fromFunction2(value))
    
    inline def setFormatFilenameUndefined: Self = StObject.set(x, "formatFilename", js.undefined)
    
    inline def setFormatFlag(value: /* flag */ String => String): Self = StObject.set(x, "formatFlag", js.Any.fromFunction1(value))
    
    inline def setFormatFlagUndefined: Self = StObject.set(x, "formatFlag", js.undefined)
    
    inline def setFormatModuleId(value: /* id */ String => String): Self = StObject.set(x, "formatModuleId", js.Any.fromFunction1(value))
    
    inline def setFormatModuleIdUndefined: Self = StObject.set(x, "formatModuleId", js.undefined)
    
    inline def setFormatSize(value: /* size */ Double => String): Self = StObject.set(x, "formatSize", js.Any.fromFunction1(value))
    
    inline def setFormatSizeUndefined: Self = StObject.set(x, "formatSize", js.undefined)
    
    inline def setFormatTime(value: (/* time */ Double, /* boldQuantity */ js.UndefOr[Boolean]) => String): Self = StObject.set(x, "formatTime", js.Any.fromFunction2(value))
    
    inline def setFormatTimeUndefined: Self = StObject.set(x, "formatTime", js.undefined)
    
    inline def setGreen(value: /* str */ String => String): Self = StObject.set(x, "green", js.Any.fromFunction1(value))
    
    inline def setGreenUndefined: Self = StObject.set(x, "green", js.undefined)
    
    inline def setMagenta(value: /* str */ String => String): Self = StObject.set(x, "magenta", js.Any.fromFunction1(value))
    
    inline def setMagentaUndefined: Self = StObject.set(x, "magenta", js.undefined)
    
    inline def setModule(value: StatsModule): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    
    inline def setModuleReason(value: StatsModuleReason): Self = StObject.set(x, "moduleReason", value.asInstanceOf[js.Any])
    
    inline def setModuleReasonUndefined: Self = StObject.set(x, "moduleReason", js.undefined)
    
    inline def setModuleUndefined: Self = StObject.set(x, "module", js.undefined)
    
    inline def setRed(value: /* str */ String => String): Self = StObject.set(x, "red", js.Any.fromFunction1(value))
    
    inline def setRedUndefined: Self = StObject.set(x, "red", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setYellow(value: /* str */ String => String): Self = StObject.set(x, "yellow", js.Any.fromFunction1(value))
    
    inline def setYellowUndefined: Self = StObject.set(x, "yellow", js.undefined)
  }
}
