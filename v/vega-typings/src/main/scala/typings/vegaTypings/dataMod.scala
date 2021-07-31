package typings.vegaTypings

import org.scalablytyped.runtime.StringDictionary
import typings.vegaTypings.anon.Feature
import typings.vegaTypings.anon.Filter
import typings.vegaTypings.anon.Property
import typings.vegaTypings.onTriggerMod.OnTrigger
import typings.vegaTypings.runtimeMod.TypeInference
import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.transformMod.Transforms
import typings.vegaTypings.vegaTypingsStrings.auto
import typings.vegaTypings.vegaTypingsStrings.csv
import typings.vegaTypings.vegaTypingsStrings.dsv
import typings.vegaTypings.vegaTypingsStrings.json
import typings.vegaTypings.vegaTypingsStrings.tsv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  trait BaseData
    extends StObject
       with Data {
    
    var name: String
    
    var on: js.UndefOr[js.Array[OnTrigger]] = js.undefined
    
    var transform: js.UndefOr[js.Array[Transforms]] = js.undefined
  }
  object BaseData {
    
    @scala.inline
    def apply(name: String): BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseData]
    }
    
    @scala.inline
    implicit class BaseDataMutableBuilder[Self <: BaseData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOn(value: js.Array[OnTrigger]): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      @scala.inline
      def setOnVarargs(value: OnTrigger*): Self = StObject.set(x, "on", js.Array(value :_*))
      
      @scala.inline
      def setTransform(value: js.Array[Transforms]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
      
      @scala.inline
      def setTransformVarargs(value: Transforms*): Self = StObject.set(x, "transform", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.dataMod.SourceData
    - typings.vegaTypings.dataMod.ValuesData
    - typings.vegaTypings.dataMod.UrlData
    - typings.vegaTypings.dataMod.BaseData
  */
  trait Data extends StObject
  object Data {
    
    @scala.inline
    def BaseData(name: String): typings.vegaTypings.dataMod.BaseData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.dataMod.BaseData]
    }
    
    @scala.inline
    def SourceData(name: String, source: String | js.Array[String]): typings.vegaTypings.dataMod.SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.dataMod.SourceData]
    }
    
    @scala.inline
    def UrlData(name: String, url: URI | SignalRef): typings.vegaTypings.dataMod.UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.dataMod.UrlData]
    }
    
    @scala.inline
    def ValuesData(name: String, values: js.Array[Datum] | js.Object): typings.vegaTypings.dataMod.ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.dataMod.ValuesData]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.vegaTypingsStrings.boolean
    - typings.vegaTypings.vegaTypingsStrings.number
    - typings.vegaTypings.vegaTypingsStrings.date
    - typings.vegaTypings.vegaTypingsStrings.string
  */
  trait DataType
    extends StObject
       with TypeInference
  object DataType {
    
    @scala.inline
    def boolean: typings.vegaTypings.vegaTypingsStrings.boolean = "boolean".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.boolean]
    
    @scala.inline
    def date: typings.vegaTypings.vegaTypingsStrings.date = "date".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.date]
    
    @scala.inline
    def number: typings.vegaTypings.vegaTypingsStrings.number = "number".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.number]
    
    @scala.inline
    def string: typings.vegaTypings.vegaTypingsStrings.string = "string".asInstanceOf[typings.vegaTypings.vegaTypingsStrings.string]
  }
  
  type Datum = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.dataMod.FormatJSON
    - typings.vegaTypings.dataMod.FormatSV
    - typings.vegaTypings.dataMod.FormatDSV
    - typings.vegaTypings.dataMod.FormatTopoJSON
    - typings.vegaTypings.anon.Parse
  */
  type Format = _Format | FormatTopoJSON
  
  trait FormatDSV
    extends StObject
       with _Format {
    
    var delimiter: String
    
    var header: js.UndefOr[js.Array[String]] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var `type`: dsv
  }
  object FormatDSV {
    
    @scala.inline
    def apply(delimiter: String): FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dsv")
      __obj.asInstanceOf[FormatDSV]
    }
    
    @scala.inline
    implicit class FormatDSVMutableBuilder[Self <: FormatDSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setType(value: dsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatJSON
    extends StObject
       with _Format {
    
    var copy: js.UndefOr[Boolean] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var property: js.UndefOr[String | SignalRef] = js.undefined
    
    var `type`: json
  }
  object FormatJSON {
    
    @scala.inline
    def apply(): FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("json")
      __obj.asInstanceOf[FormatJSON]
    }
    
    @scala.inline
    implicit class FormatJSONMutableBuilder[Self <: FormatJSON] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCopy(value: Boolean): Self = StObject.set(x, "copy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCopyUndefined: Self = StObject.set(x, "copy", js.undefined)
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setProperty(value: String | SignalRef): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setType(value: json): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatSV
    extends StObject
       with _Format {
    
    var header: js.UndefOr[js.Array[String]] = js.undefined
    
    var parse: js.UndefOr[Parse] = js.undefined
    
    var `type`: csv | tsv
  }
  object FormatSV {
    
    @scala.inline
    def apply(`type`: csv | tsv): FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormatSV]
    }
    
    @scala.inline
    implicit class FormatSVMutableBuilder[Self <: FormatSV] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeader(value: js.Array[String]): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setHeaderVarargs(value: String*): Self = StObject.set(x, "header", js.Array(value :_*))
      
      @scala.inline
      def setParse(value: Parse): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setType(value: csv | tsv): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type FormatTopoJSON = Property & (Feature | Filter)
  
  type Parse = auto | (StringDictionary[DataType | String])
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vegaTypings.dataMod.Data because Already inherited */ trait SourceData
    extends StObject
       with BaseData {
    
    var source: String | js.Array[String]
  }
  object SourceData {
    
    @scala.inline
    def apply(name: String, source: String | js.Array[String]): SourceData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceData]
    }
    
    @scala.inline
    implicit class SourceDataMutableBuilder[Self <: SourceData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String | js.Array[String]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceVarargs(value: String*): Self = StObject.set(x, "source", js.Array(value :_*))
    }
  }
  
  type URI = String
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vegaTypings.dataMod.Data because Already inherited */ trait UrlData
    extends StObject
       with BaseData {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var format: js.UndefOr[Format | SignalRef] = js.undefined
    
    var url: URI | SignalRef
  }
  object UrlData {
    
    @scala.inline
    def apply(name: String, url: URI | SignalRef): UrlData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlData]
    }
    
    @scala.inline
    implicit class UrlDataMutableBuilder[Self <: UrlData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setUrl(value: URI | SignalRef): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.vegaTypings.dataMod.Data because Already inherited */ trait ValuesData
    extends StObject
       with BaseData {
    
    var async: js.UndefOr[Boolean | SignalRef] = js.undefined
    
    var format: js.UndefOr[Format | SignalRef] = js.undefined
    
    var values: js.Array[Datum] | js.Object
  }
  object ValuesData {
    
    @scala.inline
    def apply(name: String, values: js.Array[Datum] | js.Object): ValuesData = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValuesData]
    }
    
    @scala.inline
    implicit class ValuesDataMutableBuilder[Self <: ValuesData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean | SignalRef): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setFormat(value: Format | SignalRef): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setValues(value: js.Array[Datum] | js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesVarargs(value: Datum*): Self = StObject.set(x, "values", js.Array(value :_*))
    }
  }
  
  trait _Format extends StObject
  object _Format {
    
    @scala.inline
    def FormatDSV(delimiter: String): typings.vegaTypings.dataMod.FormatDSV = {
      val __obj = js.Dynamic.literal(delimiter = delimiter.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("dsv")
      __obj.asInstanceOf[typings.vegaTypings.dataMod.FormatDSV]
    }
    
    @scala.inline
    def FormatJSON(): typings.vegaTypings.dataMod.FormatJSON = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("json")
      __obj.asInstanceOf[typings.vegaTypings.dataMod.FormatJSON]
    }
    
    @scala.inline
    def FormatSV(`type`: csv | tsv): typings.vegaTypings.dataMod.FormatSV = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.dataMod.FormatSV]
    }
    
    @scala.inline
    def Parse(parse: typings.vegaTypings.dataMod.Parse): typings.vegaTypings.anon.Parse = {
      val __obj = js.Dynamic.literal(parse = parse.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.anon.Parse]
    }
  }
}
