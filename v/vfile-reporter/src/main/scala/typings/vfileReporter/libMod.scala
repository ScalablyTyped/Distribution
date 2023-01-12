package typings.vfileReporter

import typings.std.Record
import typings.vfileReporter.vfileReporterStrings.file
import typings.vfileStatistics.mod.Statistics_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("vfile-reporter/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reporter(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")().asInstanceOf[String]
  inline def reporter(files: js.Array[typings.vfile.mod.VFile]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: js.Array[typings.vfile.mod.VFile], options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: js.Error): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: js.Error, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: Unit, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def reporter(files: typings.vfile.mod.VFile): String = ^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def reporter(files: typings.vfile.mod.VFile, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("reporter")(files.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait FileRow extends StObject {
    
    var file: VFile
    
    var stats: Statistics
    
    var `type`: file
  }
  object FileRow {
    
    inline def apply(file: VFile, stats: Statistics): FileRow = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("file")
      __obj.asInstanceOf[FileRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileRow] (val x: Self) extends AnyVal {
      
      inline def setFile(value: VFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Statistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      inline def setType(value: file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Info extends StObject {
    
    var rows: js.Array[FileRow | Row]
    
    var sizes: Sizes
    
    var stats: Statistics
  }
  object Info {
    
    inline def apply(rows: js.Array[FileRow | Row], sizes: Sizes, stats: Statistics): Info = {
      val __obj = js.Dynamic.literal(rows = rows.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Info] (val x: Self) extends AnyVal {
      
      inline def setRows(value: js.Array[FileRow | Row]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (FileRow | Row)*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSizes(value: Sizes): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      inline def setStats(value: Statistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var color: js.UndefOr[Boolean] = js.undefined
    
    var defaultName: js.UndefOr[String] = js.undefined
    
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    var silent: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setColor(value: Boolean): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setDefaultName(value: String): Self = StObject.set(x, "defaultName", value.asInstanceOf[js.Any])
      
      inline def setDefaultNameUndefined: Self = StObject.set(x, "defaultName", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait Row extends StObject {
    
    var label: String
    
    var place: String
    
    var reason: String
    
    var ruleId: String
    
    var source: String
  }
  object Row {
    
    inline def apply(label: String, place: String, reason: String, ruleId: String, source: String): Row = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], place = place.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setPlace(value: String): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type Sizes = Record[String, Double]
  
  type Statistics = Statistics_
  
  type VFile = typings.vfile.mod.VFile
  
  type VFileMessage = typings.vfileMessage.mod.VFileMessage
}
