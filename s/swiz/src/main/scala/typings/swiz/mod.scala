package typings.swiz

import org.scalablytyped.runtime.StringDictionary
import typings.swiz.mod.struct.IField
import typings.swiz.mod.struct.IObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swiz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Chain_(): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("Chain")().asInstanceOf[IChain]
  
  @JSImport("swiz", "Cidr")
  @js.native
  open class Cidr protected () extends StObject {
    def this(x: String) = this()
    def this(x: String, y: String) = this()
    
    def isInCIDR(x: Any): Boolean = js.native
  }
  
  @js.native
  sealed trait SERIALIZATION extends StObject
  @JSImport("swiz", "SERIALIZATION")
  @js.native
  object SERIALIZATION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SERIALIZATION & Double] = js.native
    
    @js.native
    sealed trait SERIALIZATION_JSON
      extends StObject
         with SERIALIZATION
    /* 0 */ val SERIALIZATION_JSON: typings.swiz.mod.SERIALIZATION.SERIALIZATION_JSON & Double = js.native
    
    @js.native
    sealed trait SERIALIZATION_XML
      extends StObject
         with SERIALIZATION
    /* 1 */ val SERIALIZATION_XML: typings.swiz.mod.SERIALIZATION.SERIALIZATION_XML & Double = js.native
  }
  
  @JSImport("swiz", "Swiz")
  @js.native
  open class Swiz protected () extends StObject {
    def this(defs: js.Array[IObj]) = this()
    def this(defs: js.Array[IObj], options: ISwizOptions) = this()
    
    def buildObject(obj: Any, callback: js.Function2[/* err */ Any, /* result */ Any, Unit]): Unit = js.native
    
    def buildObjectSync(obj: Any): Any = js.native
    
    def deserialize(
      mode: SERIALIZATION,
      version: Double,
      raw: String,
      callback: js.Function2[/* err */ Any, /* result */ Any, Unit]
    ): Unit = js.native
    
    def deserializeXml(xml: String): Any = js.native
    
    def getFieldDefinition(stype: String, name: String): IField = js.native
    
    def serialize(
      mode: SERIALIZATION,
      version: Double,
      obj: ISerializable,
      callback: js.Function2[/* err */ Any, /* result */ String, Unit]
    ): Unit = js.native
    
    def serializeForPagination(
      mode: SERIALIZATION,
      array: js.Array[Any],
      metadata: Any,
      callback: js.Function2[/* err */ Any, /* result */ String, Unit]
    ): Unit = js.native
    
    def serializeJson(obj: Any): String = js.native
    
    def serializeXml(obj: Any): String = js.native
  }
  
  @JSImport("swiz", "Valve")
  @js.native
  open class Valve protected () extends StObject {
    def this(schema: IValveSchema) = this()
    def this(schema: IValveSchema, baton: Any) = this()
    
    def addChainValidator(
      name: String,
      description: String,
      func: js.Function2[
          /* value */ Any, 
          /* callback */ js.Function2[/* err */ js.Error, /* cleaned */ Any, Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def addFinalValidator(
      func: js.Function2[
          /* obj */ Any, 
          /* callback */ js.Function2[/* err */ js.Error, /* cleaned */ Any, Unit], 
          Unit
        ]
    ): Valve = js.native
    
    def check(obj: Any, callback: js.Function2[/* err */ Any, /* cleaned */ Any, Unit]): Unit = js.native
    def check(obj: Any, options: ICheckOptions, callback: js.Function2[/* err */ Any, /* cleaned */ Any, Unit]): Unit = js.native
    
    def checkUpdate(existing: Any, obj: Any, callback: js.Function2[/* err */ Any, /* cleaned */ Any, Unit]): Unit = js.native
    
    def help(schema: IValveSchema): Any = js.native
    
    def setSchema(schema: IValveSchema): Valve = js.native
  }
  
  inline def chain(): IChain = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")().asInstanceOf[IChain]
  
  inline def defToValve(`def`: js.Array[IObj]): js.Array[IValveSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("defToValve")(`def`.asInstanceOf[js.Any]).asInstanceOf[js.Array[IValveSchema]]
  
  inline def stripSerializerTypes(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stripSerializerTypes")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  object struct {
    
    @JSImport("swiz", "struct")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Field(name: String): IField = ^.asInstanceOf[js.Dynamic].applyDynamic("Field")(name.asInstanceOf[js.Any]).asInstanceOf[IField]
    inline def Field(name: String, options: IFieldOptions): IField = (^.asInstanceOf[js.Dynamic].applyDynamic("Field")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IField]
    
    inline def Obj(name: String): IObj = ^.asInstanceOf[js.Dynamic].applyDynamic("Obj")(name.asInstanceOf[js.Any]).asInstanceOf[IObj]
    inline def Obj(name: String, options: IObjOptions): IObj = (^.asInstanceOf[js.Dynamic].applyDynamic("Obj")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[IObj]
    
    inline def coerce(value: Any, coerceTo: String): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("coerce")(value.asInstanceOf[js.Any], coerceTo.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    trait IField extends StObject {
      
      var attribute: Boolean
      
      var coerceTo: Any
      
      var desc: js.UndefOr[String] = js.undefined
      
      var enumerated: Boolean
      
      var filterFrom: js.Array[String]
      
      var ignorePublic: Boolean
      
      var name: String
      
      var options: IFieldOptions
      
      var plural: String
      
      var singular: String
      
      var src: String
      
      var `val`: js.UndefOr[IChain] = js.undefined
    }
    object IField {
      
      inline def apply(
        attribute: Boolean,
        coerceTo: Any,
        enumerated: Boolean,
        filterFrom: js.Array[String],
        ignorePublic: Boolean,
        name: String,
        options: IFieldOptions,
        plural: String,
        singular: String,
        src: String
      ): IField = {
        val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], coerceTo = coerceTo.asInstanceOf[js.Any], enumerated = enumerated.asInstanceOf[js.Any], filterFrom = filterFrom.asInstanceOf[js.Any], ignorePublic = ignorePublic.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
        __obj.asInstanceOf[IField]
      }
      
      extension [Self <: IField](x: Self) {
        
        inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        inline def setCoerceTo(value: Any): Self = StObject.set(x, "coerceTo", value.asInstanceOf[js.Any])
        
        inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        inline def setEnumerated(value: Boolean): Self = StObject.set(x, "enumerated", value.asInstanceOf[js.Any])
        
        inline def setFilterFrom(value: js.Array[String]): Self = StObject.set(x, "filterFrom", value.asInstanceOf[js.Any])
        
        inline def setFilterFromVarargs(value: String*): Self = StObject.set(x, "filterFrom", js.Array(value*))
        
        inline def setIgnorePublic(value: Boolean): Self = StObject.set(x, "ignorePublic", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        inline def setVal(value: IChain): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
        
        inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
      }
    }
    
    trait IFieldOptions extends StObject {
      
      var attribute: js.UndefOr[Boolean] = js.undefined
      
      var coerceTo: js.UndefOr[String] = js.undefined
      
      var desc: js.UndefOr[String] = js.undefined
      
      var enumerated: js.UndefOr[Any] = js.undefined
      
      var filterFrom: js.UndefOr[js.Array[String]] = js.undefined
      
      var ignorePublic: js.UndefOr[Boolean] = js.undefined
      
      var plural: js.UndefOr[String] = js.undefined
      
      var singular: js.UndefOr[String] = js.undefined
      
      var src: js.UndefOr[String] = js.undefined
      
      var `val`: js.UndefOr[IChain] = js.undefined
    }
    object IFieldOptions {
      
      inline def apply(): IFieldOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFieldOptions]
      }
      
      extension [Self <: IFieldOptions](x: Self) {
        
        inline def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        inline def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
        
        inline def setCoerceTo(value: String): Self = StObject.set(x, "coerceTo", value.asInstanceOf[js.Any])
        
        inline def setCoerceToUndefined: Self = StObject.set(x, "coerceTo", js.undefined)
        
        inline def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        inline def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        inline def setEnumerated(value: Any): Self = StObject.set(x, "enumerated", value.asInstanceOf[js.Any])
        
        inline def setEnumeratedUndefined: Self = StObject.set(x, "enumerated", js.undefined)
        
        inline def setFilterFrom(value: js.Array[String]): Self = StObject.set(x, "filterFrom", value.asInstanceOf[js.Any])
        
        inline def setFilterFromUndefined: Self = StObject.set(x, "filterFrom", js.undefined)
        
        inline def setFilterFromVarargs(value: String*): Self = StObject.set(x, "filterFrom", js.Array(value*))
        
        inline def setIgnorePublic(value: Boolean): Self = StObject.set(x, "ignorePublic", value.asInstanceOf[js.Any])
        
        inline def setIgnorePublicUndefined: Self = StObject.set(x, "ignorePublic", js.undefined)
        
        inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
        
        inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
        
        inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        inline def setVal(value: IChain): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
        
        inline def setValUndefined: Self = StObject.set(x, "val", js.undefined)
      }
    }
    
    trait IObj extends StObject {
      
      var fields: js.Array[IField]
      
      var name: String
      
      var options: IObjOptions
      
      var plural: String
      
      var singular: String
    }
    object IObj {
      
      inline def apply(fields: js.Array[IField], name: String, options: IObjOptions, plural: String, singular: String): IObj = {
        val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
        __obj.asInstanceOf[IObj]
      }
      
      extension [Self <: IObj](x: Self) {
        
        inline def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setOptions(value: IObjOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      }
    }
    
    trait IObjOptions extends StObject {
      
      var fields: js.UndefOr[js.Array[IField]] = js.undefined
      
      var plural: js.UndefOr[String] = js.undefined
      
      var singular: js.UndefOr[String] = js.undefined
    }
    object IObjOptions {
      
      inline def apply(): IObjOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IObjOptions]
      }
      
      extension [Self <: IObjOptions](x: Self) {
        
        inline def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        inline def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value*))
        
        inline def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        inline def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
        
        inline def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        inline def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      }
    }
  }
  
  @js.native
  trait IChain
    extends StObject
       with IValveSchemaMember {
    
    def contains(arg: Any): IChain = js.native
    
    def custom(name: String): IChain = js.native
    
    def entityDecode(): IChain = js.native
    
    def entityEncode(): IChain = js.native
    
    def enumerated(map: Any): IChain = js.native
    
    def getValidatorAtPos(pos: Double): IValidator = js.native
    
    def getValidatorPos(name: String): Double = js.native
    
    def hasValidator(name: String): Double = js.native
    
    def ifNull(replace: String): IChain = js.native
    
    def immutable(): IChain = js.native
    
    def inArray(array: js.Array[Any]): IChain = js.native
    
    def is(pattern: String): IChain = js.native
    def is(pattern: String, modifiers: String): IChain = js.native
    
    def isAddressPair(): IChain = js.native
    
    def isAllowedFQDNOrIP(): IChain = js.native
    def isAllowedFQDNOrIP(blacklist: js.Array[String]): IChain = js.native
    
    def isAlpha(): IChain = js.native
    
    def isAlphanumeric(): IChain = js.native
    
    def isArray(chain: IChain): IChain = js.native
    
    def isBoolean(): IChain = js.native
    
    def isCIDR(): IChain = js.native
    
    def isDecimal(): IChain = js.native
    
    def isEmail(): IChain = js.native
    
    def isFloat(): IChain = js.native
    
    def isHash(keyChain: IChain, valueChain: IChain): IChain = js.native
    
    def isHostname(): IChain = js.native
    
    def isHostnameOrIp(): IChain = js.native
    
    def isIP(): IChain = js.native
    
    def isIPv4(): IChain = js.native
    
    def isIPv6(): IChain = js.native
    
    def isInt(): IChain = js.native
    
    def isLowercase(): IChain = js.native
    
    def isNull(): IChain = js.native
    
    def isNumeric(): IChain = js.native
    
    def isPort(): IChain = js.native
    
    def isString(): IChain = js.native
    
    def isUnique(): IChain = js.native
    
    def isUppercase(): IChain = js.native
    
    def isUrl(): IChain = js.native
    
    def isV1UUID(): IChain = js.native
    
    def len(min: Double): IChain = js.native
    def len(min: Double, max: Double): IChain = js.native
    
    def ltrim(): IChain = js.native
    def ltrim(chars: String): IChain = js.native
    
    def not(pattern: String, modifiers: String): IChain = js.native
    
    def notContains(arg: Any): IChain = js.native
    
    def notEmpty(): IChain = js.native
    
    def notIPBlacklisted(): IChain = js.native
    
    def notIn(values: js.Array[Any]): IChain = js.native
    def notIn(values: js.Array[Any], caseSensitive: Boolean): IChain = js.native
    
    def notNull(): IChain = js.native
    
    def notRegex(pattern: String): IChain = js.native
    def notRegex(pattern: String, modifiers: String): IChain = js.native
    def notRegex(pattern: js.RegExp): IChain = js.native
    
    def numItems(min: Double, max: Double): IChain = js.native
    
    def optional(): IChain = js.native
    
    def range(min: Any, max: Any): IChain = js.native
    
    def regex(pattern: String): IChain = js.native
    def regex(pattern: String, modifiers: String): IChain = js.native
    def regex(pattern: js.RegExp): IChain = js.native
    
    def rename(target: String): IChain = js.native
    
    def rtrim(chars: String): IChain = js.native
    
    def toBoolean(): IChain = js.native
    
    def toBooleanStrict(): IChain = js.native
    
    def toFloat(): IChain = js.native
    
    def toInt(): IChain = js.native
    
    def toUnique(): IChain = js.native
    
    def trim(): IChain = js.native
    def trim(chars: String): IChain = js.native
    
    def updateRequired(): IChain = js.native
    
    def xss(): IChain = js.native
    def xss(is_image: Boolean): IChain = js.native
  }
  
  trait ICheckOptions extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.undefined
  }
  object ICheckOptions {
    
    inline def apply(): ICheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckOptions]
    }
    
    extension [Self <: ICheckOptions](x: Self) {
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  trait ISerializable extends StObject {
    
    def getSerializerType(): String
  }
  object ISerializable {
    
    inline def apply(getSerializerType: () => String): ISerializable = {
      val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
      __obj.asInstanceOf[ISerializable]
    }
    
    extension [Self <: ISerializable](x: Self) {
      
      inline def setGetSerializerType(value: () => String): Self = StObject.set(x, "getSerializerType", js.Any.fromFunction0(value))
    }
  }
  
  trait ISwizOptions extends StObject {
    
    var `for`: js.UndefOr[String] = js.undefined
    
    var stripNulls: js.UndefOr[Boolean] = js.undefined
    
    var stripSerializerType: js.UndefOr[Boolean] = js.undefined
  }
  object ISwizOptions {
    
    inline def apply(): ISwizOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwizOptions]
    }
    
    extension [Self <: ISwizOptions](x: Self) {
      
      inline def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      inline def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      inline def setStripNulls(value: Boolean): Self = StObject.set(x, "stripNulls", value.asInstanceOf[js.Any])
      
      inline def setStripNullsUndefined: Self = StObject.set(x, "stripNulls", js.undefined)
      
      inline def setStripSerializerType(value: Boolean): Self = StObject.set(x, "stripSerializerType", value.asInstanceOf[js.Any])
      
      inline def setStripSerializerTypeUndefined: Self = StObject.set(x, "stripSerializerType", js.undefined)
    }
  }
  
  trait IValidator extends StObject {
    
    def func(value: Any, baton: Any, callback: js.Function): Unit
    
    var help: String
    
    var name: String
  }
  object IValidator {
    
    inline def apply(func: (Any, Any, js.Function) => Unit, help: String, name: String): IValidator = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidator]
    }
    
    extension [Self <: IValidator](x: Self) {
      
      inline def setFunc(value: (Any, Any, js.Function) => Unit): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      inline def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type IValveSchema = StringDictionary[IValveSchemaMember]
  
  trait IValveSchemaMember extends StObject
  
  trait IValveSchemaMemberArray
    extends StObject
       with IValveSchemaMember
       with /* index */ StringDictionary[IValveSchemaMember]
  object IValveSchemaMemberArray {
    
    inline def apply(): IValveSchemaMemberArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IValveSchemaMemberArray]
    }
  }
}
