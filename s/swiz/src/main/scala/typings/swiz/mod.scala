package typings.swiz

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.std.RegExp
import typings.swiz.mod.struct.IField
import typings.swiz.mod.struct.IObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("swiz", "Chain")
  @js.native
  def Chain_(): IChain = js.native
  
  @JSImport("swiz", "Cidr")
  @js.native
  class Cidr protected () extends StObject {
    def this(x: String) = this()
    def this(x: String, y: String) = this()
    
    def isInCIDR(x: js.Any): Boolean = js.native
  }
  
  @js.native
  sealed trait SERIALIZATION extends StObject
  @JSImport("swiz", "SERIALIZATION")
  @js.native
  object SERIALIZATION extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SERIALIZATION with Double] = js.native
    
    @js.native
    sealed trait SERIALIZATION_JSON extends SERIALIZATION
    /* 0 */ val SERIALIZATION_JSON: typings.swiz.mod.SERIALIZATION.SERIALIZATION_JSON with Double = js.native
    
    @js.native
    sealed trait SERIALIZATION_XML extends SERIALIZATION
    /* 1 */ val SERIALIZATION_XML: typings.swiz.mod.SERIALIZATION.SERIALIZATION_XML with Double = js.native
  }
  
  @JSImport("swiz", "Swiz")
  @js.native
  class Swiz protected () extends StObject {
    def this(defs: js.Array[IObj]) = this()
    def this(defs: js.Array[IObj], options: ISwizOptions) = this()
    
    def buildObject(obj: js.Any, callback: js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]): Unit = js.native
    
    def buildObjectSync(obj: js.Any): js.Any = js.native
    
    def deserialize(
      mode: SERIALIZATION,
      version: Double,
      raw: String,
      callback: js.Function2[/* err */ js.Any, /* result */ js.Any, Unit]
    ): Unit = js.native
    
    def deserializeXml(xml: String): js.Any = js.native
    
    def getFieldDefinition(stype: String, name: String): IField = js.native
    
    def serialize(
      mode: SERIALIZATION,
      version: Double,
      obj: ISerializable,
      callback: js.Function2[/* err */ js.Any, /* result */ String, Unit]
    ): Unit = js.native
    
    def serializeForPagination(
      mode: SERIALIZATION,
      array: js.Array[_],
      metadata: js.Any,
      callback: js.Function2[/* err */ js.Any, /* result */ String, Unit]
    ): Unit = js.native
    
    def serializeJson(obj: js.Any): String = js.native
    
    def serializeXml(obj: js.Any): String = js.native
  }
  
  @JSImport("swiz", "Valve")
  @js.native
  class Valve protected () extends StObject {
    def this(schema: IValveSchema) = this()
    def this(schema: IValveSchema, baton: js.Any) = this()
    
    def addChainValidator(
      name: String,
      description: String,
      func: js.Function2[
          /* value */ js.Any, 
          /* callback */ js.Function2[/* err */ Error, /* cleaned */ js.Any, Unit], 
          Unit
        ]
    ): Unit = js.native
    
    def addFinalValidator(
      func: js.Function2[
          /* obj */ js.Any, 
          /* callback */ js.Function2[/* err */ Error, /* cleaned */ js.Any, Unit], 
          Unit
        ]
    ): Valve = js.native
    
    def check(obj: js.Any, callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]): Unit = js.native
    def check(
      obj: js.Any,
      options: ICheckOptions,
      callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]
    ): Unit = js.native
    
    def checkUpdate(
      existing: js.Any,
      obj: js.Any,
      callback: js.Function2[/* err */ js.Any, /* cleaned */ js.Any, Unit]
    ): Unit = js.native
    
    def help(schema: IValveSchema): js.Any = js.native
    
    def setSchema(schema: IValveSchema): Valve = js.native
  }
  
  @JSImport("swiz", "chain")
  @js.native
  def chain(): IChain = js.native
  
  @JSImport("swiz", "defToValve")
  @js.native
  def defToValve(`def`: js.Array[IObj]): js.Array[IValveSchema] = js.native
  
  @JSImport("swiz", "stripSerializerTypes")
  @js.native
  def stripSerializerTypes(obj: js.Any): js.Any = js.native
  
  object struct {
    
    @JSImport("swiz", "struct.Field")
    @js.native
    def Field(name: String): IField = js.native
    @JSImport("swiz", "struct.Field")
    @js.native
    def Field(name: String, options: IFieldOptions): IField = js.native
    
    @JSImport("swiz", "struct.Obj")
    @js.native
    def Obj(name: String): IObj = js.native
    @JSImport("swiz", "struct.Obj")
    @js.native
    def Obj(name: String, options: IObjOptions): IObj = js.native
    
    @JSImport("swiz", "struct.coerce")
    @js.native
    def coerce(value: js.Any, coerceTo: String): js.Any = js.native
    
    @js.native
    trait IField extends StObject {
      
      var attribute: Boolean = js.native
      
      var coerceTo: js.Any = js.native
      
      var desc: js.UndefOr[String] = js.native
      
      var enumerated: Boolean = js.native
      
      var filterFrom: js.Array[String] = js.native
      
      var ignorePublic: Boolean = js.native
      
      var name: String = js.native
      
      var options: IFieldOptions = js.native
      
      var plural: String = js.native
      
      var singular: String = js.native
      
      var src: String = js.native
      
      var `val`: js.UndefOr[IChain] = js.native
    }
    object IField {
      
      @scala.inline
      def apply(
        attribute: Boolean,
        coerceTo: js.Any,
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
      
      @scala.inline
      implicit class IFieldMutableBuilder[Self <: IField] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoerceTo(value: js.Any): Self = StObject.set(x, "coerceTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        @scala.inline
        def setEnumerated(value: Boolean): Self = StObject.set(x, "enumerated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterFrom(value: js.Array[String]): Self = StObject.set(x, "filterFrom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterFromVarargs(value: String*): Self = StObject.set(x, "filterFrom", js.Array(value :_*))
        
        @scala.inline
        def setIgnorePublic(value: Boolean): Self = StObject.set(x, "ignorePublic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: IFieldOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVal(value: IChain): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValUndefined: Self = StObject.set(x, "val", js.undefined)
      }
    }
    
    @js.native
    trait IFieldOptions extends StObject {
      
      var attribute: js.UndefOr[Boolean] = js.native
      
      var coerceTo: js.UndefOr[String] = js.native
      
      var desc: js.UndefOr[String] = js.native
      
      var enumerated: js.UndefOr[js.Any] = js.native
      
      var filterFrom: js.UndefOr[js.Array[String]] = js.native
      
      var ignorePublic: js.UndefOr[Boolean] = js.native
      
      var plural: js.UndefOr[String] = js.native
      
      var singular: js.UndefOr[String] = js.native
      
      var src: js.UndefOr[String] = js.native
      
      var `val`: js.UndefOr[IChain] = js.native
    }
    object IFieldOptions {
      
      @scala.inline
      def apply(): IFieldOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IFieldOptions]
      }
      
      @scala.inline
      implicit class IFieldOptionsMutableBuilder[Self <: IFieldOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAttribute(value: Boolean): Self = StObject.set(x, "attribute", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAttributeUndefined: Self = StObject.set(x, "attribute", js.undefined)
        
        @scala.inline
        def setCoerceTo(value: String): Self = StObject.set(x, "coerceTo", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCoerceToUndefined: Self = StObject.set(x, "coerceTo", js.undefined)
        
        @scala.inline
        def setDesc(value: String): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDescUndefined: Self = StObject.set(x, "desc", js.undefined)
        
        @scala.inline
        def setEnumerated(value: js.Any): Self = StObject.set(x, "enumerated", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEnumeratedUndefined: Self = StObject.set(x, "enumerated", js.undefined)
        
        @scala.inline
        def setFilterFrom(value: js.Array[String]): Self = StObject.set(x, "filterFrom", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFilterFromUndefined: Self = StObject.set(x, "filterFrom", js.undefined)
        
        @scala.inline
        def setFilterFromVarargs(value: String*): Self = StObject.set(x, "filterFrom", js.Array(value :_*))
        
        @scala.inline
        def setIgnorePublic(value: Boolean): Self = StObject.set(x, "ignorePublic", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIgnorePublicUndefined: Self = StObject.set(x, "ignorePublic", js.undefined)
        
        @scala.inline
        def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
        
        @scala.inline
        def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
        
        @scala.inline
        def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
        
        @scala.inline
        def setVal(value: IChain): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setValUndefined: Self = StObject.set(x, "val", js.undefined)
      }
    }
    
    @js.native
    trait IObj extends StObject {
      
      var fields: js.Array[IField] = js.native
      
      var name: String = js.native
      
      var options: IObjOptions = js.native
      
      var plural: String = js.native
      
      var singular: String = js.native
    }
    object IObj {
      
      @scala.inline
      def apply(fields: js.Array[IField], name: String, options: IObjOptions, plural: String, singular: String): IObj = {
        val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], singular = singular.asInstanceOf[js.Any])
        __obj.asInstanceOf[IObj]
      }
      
      @scala.inline
      implicit class IObjMutableBuilder[Self <: IObj] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOptions(value: IObjOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IObjOptions extends StObject {
      
      var fields: js.UndefOr[js.Array[IField]] = js.native
      
      var plural: js.UndefOr[String] = js.native
      
      var singular: js.UndefOr[String] = js.native
    }
    object IObjOptions {
      
      @scala.inline
      def apply(): IObjOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IObjOptions]
      }
      
      @scala.inline
      implicit class IObjOptionsMutableBuilder[Self <: IObjOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFields(value: js.Array[IField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
        
        @scala.inline
        def setFieldsVarargs(value: IField*): Self = StObject.set(x, "fields", js.Array(value :_*))
        
        @scala.inline
        def setPlural(value: String): Self = StObject.set(x, "plural", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPluralUndefined: Self = StObject.set(x, "plural", js.undefined)
        
        @scala.inline
        def setSingular(value: String): Self = StObject.set(x, "singular", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSingularUndefined: Self = StObject.set(x, "singular", js.undefined)
      }
    }
  }
  
  @js.native
  trait IChain extends IValveSchemaMember {
    
    def contains(arg: js.Any): IChain = js.native
    
    def custom(name: String): IChain = js.native
    
    def entityDecode(): IChain = js.native
    
    def entityEncode(): IChain = js.native
    
    def enumerated(map: js.Any): IChain = js.native
    
    def equals(arg: js.Any): IChain = js.native
    
    def getValidatorAtPos(pos: Double): IValidator = js.native
    
    def getValidatorPos(name: String): Double = js.native
    
    def hasValidator(name: String): Double = js.native
    
    def ifNull(replace: String): IChain = js.native
    
    def immutable(): IChain = js.native
    
    def inArray(array: js.Array[_]): IChain = js.native
    
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
    
    def notContains(arg: js.Any): IChain = js.native
    
    def notEmpty(): IChain = js.native
    
    def notIPBlacklisted(): IChain = js.native
    
    def notIn(values: js.Array[_]): IChain = js.native
    def notIn(values: js.Array[_], caseSensitive: Boolean): IChain = js.native
    
    def notNull(): IChain = js.native
    
    def notRegex(pattern: String): IChain = js.native
    def notRegex(pattern: String, modifiers: String): IChain = js.native
    def notRegex(pattern: RegExp): IChain = js.native
    
    def numItems(min: Double, max: Double): IChain = js.native
    
    def optional(): IChain = js.native
    
    def range(min: js.Any, max: js.Any): IChain = js.native
    
    def regex(pattern: String): IChain = js.native
    def regex(pattern: String, modifiers: String): IChain = js.native
    def regex(pattern: RegExp): IChain = js.native
    
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
  
  @js.native
  trait ICheckOptions extends StObject {
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ICheckOptions {
    
    @scala.inline
    def apply(): ICheckOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICheckOptions]
    }
    
    @scala.inline
    implicit class ICheckOptionsMutableBuilder[Self <: ICheckOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait ISerializable extends StObject {
    
    def getSerializerType(): String = js.native
  }
  object ISerializable {
    
    @scala.inline
    def apply(getSerializerType: () => String): ISerializable = {
      val __obj = js.Dynamic.literal(getSerializerType = js.Any.fromFunction0(getSerializerType))
      __obj.asInstanceOf[ISerializable]
    }
    
    @scala.inline
    implicit class ISerializableMutableBuilder[Self <: ISerializable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetSerializerType(value: () => String): Self = StObject.set(x, "getSerializerType", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ISwizOptions extends StObject {
    
    var `for`: js.UndefOr[String] = js.native
    
    var stripNulls: js.UndefOr[Boolean] = js.native
    
    var stripSerializerType: js.UndefOr[Boolean] = js.native
  }
  object ISwizOptions {
    
    @scala.inline
    def apply(): ISwizOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISwizOptions]
    }
    
    @scala.inline
    implicit class ISwizOptionsMutableBuilder[Self <: ISwizOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFor(value: String): Self = StObject.set(x, "for", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForUndefined: Self = StObject.set(x, "for", js.undefined)
      
      @scala.inline
      def setStripNulls(value: Boolean): Self = StObject.set(x, "stripNulls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripNullsUndefined: Self = StObject.set(x, "stripNulls", js.undefined)
      
      @scala.inline
      def setStripSerializerType(value: Boolean): Self = StObject.set(x, "stripSerializerType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripSerializerTypeUndefined: Self = StObject.set(x, "stripSerializerType", js.undefined)
    }
  }
  
  @js.native
  trait IValidator extends StObject {
    
    def func(value: js.Any, baton: js.Any, callback: js.Function): Unit = js.native
    
    var help: String = js.native
    
    var name: String = js.native
  }
  object IValidator {
    
    @scala.inline
    def apply(func: (js.Any, js.Any, js.Function) => Unit, help: String, name: String): IValidator = {
      val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IValidator]
    }
    
    @scala.inline
    implicit class IValidatorMutableBuilder[Self <: IValidator] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFunc(value: (js.Any, js.Any, js.Function) => Unit): Self = StObject.set(x, "func", js.Any.fromFunction3(value))
      
      @scala.inline
      def setHelp(value: String): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type IValveSchema = StringDictionary[IValveSchemaMember]
  
  @js.native
  trait IValveSchemaMember extends StObject
  
  @js.native
  trait IValveSchemaMemberArray
    extends IValveSchemaMember
       with /* index */ StringDictionary[IValveSchemaMember]
  object IValveSchemaMemberArray {
    
    @scala.inline
    def apply(): IValveSchemaMemberArray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IValveSchemaMemberArray]
    }
  }
}
