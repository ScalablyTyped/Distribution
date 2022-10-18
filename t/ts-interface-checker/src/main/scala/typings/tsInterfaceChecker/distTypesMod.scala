package typings.tsInterfaceChecker

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import typings.tsInterfaceChecker.distUtilMod.IContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("ts-interface-checker/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-interface-checker/dist/types", "BasicType")
  @js.native
  open class BasicType protected () extends TType {
    def this(validator: js.Function1[/* value */ Any, Boolean], message: String) = this()
    
    /* private */ var message: Any = js.native
    
    def validator(value: Any): Boolean = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "RestType")
  @js.native
  open class RestType protected () extends TType {
    def this(typeSpec: TypeSpec) = this()
    
    /* private */ var _start: Any = js.native
    
    def setStart(start: Double): Unit = js.native
    
    var typeSpec: TypeSpec = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TArray")
  @js.native
  open class TArray protected () extends TType {
    def this(ttype: TType) = this()
    
    var name: js.UndefOr[String] = js.native
    
    var ttype: TType = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TEnumLiteral")
  @js.native
  open class TEnumLiteral protected () extends TType {
    def this(enumName: String, prop: String) = this()
    
    /* private */ var _failMsg: Any = js.native
    
    var enumName: String = js.native
    
    var prop: String = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TEnumType")
  @js.native
  open class TEnumType protected () extends TType {
    def this(members: StringDictionary[String | Double]) = this()
    
    /* private */ var _failMsg: Any = js.native
    
    var members: StringDictionary[String | Double] = js.native
    
    val validValues: Set[String | Double] = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TFunc")
  @js.native
  open class TFunc protected () extends TType {
    def this(paramList: TParamList, result: TType) = this()
    
    var paramList: TParamList = js.native
    
    var result: TType = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TIface")
  @js.native
  open class TIface protected () extends TType {
    def this(bases: js.Array[String], props: js.Array[TProp]) = this()
    def this(bases: js.Array[String], props: js.Array[TProp], indexType: TOptional) = this()
    def this(bases: js.Array[String], props: js.Array[TProp], indexType: TypeSpec) = this()
    
    var bases: js.Array[String] = js.native
    
    var indexType: js.UndefOr[TType] = js.native
    
    /* private */ var propSet: Any = js.native
    
    var props: js.Array[TProp] = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TIntersection")
  @js.native
  open class TIntersection protected () extends TType {
    def this(ttypes: js.Array[TType]) = this()
    
    var ttypes: js.Array[TType] = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TLiteral")
  @js.native
  open class TLiteral protected () extends TType {
    def this(value: Any) = this()
    
    /* private */ var _failMsg: Any = js.native
    
    var name: String = js.native
    
    var value: Any = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TName")
  @js.native
  open class TName protected () extends TType {
    def this(name: String) = this()
    
    /* private */ var _checkerBeingBuilt: Any = js.native
    
    /* private */ var _failMsg: Any = js.native
    
    /* private */ var _getChecker: Any = js.native
    
    var name: String = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TOptional")
  @js.native
  open class TOptional protected () extends TType {
    def this(ttype: TType) = this()
    
    var ttype: TType = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TParam")
  @js.native
  open class TParam protected () extends StObject {
    def this(name: String, ttype: TType, isOpt: Boolean) = this()
    
    var isOpt: Boolean = js.native
    
    var name: String = js.native
    
    var ttype: TType = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TParamList")
  @js.native
  open class TParamList protected () extends TType {
    def this(params: js.Array[TParam]) = this()
    
    var params: js.Array[TParam] = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TProp")
  @js.native
  open class TProp protected () extends StObject {
    def this(name: String, ttype: TType, isOpt: Boolean) = this()
    
    var isOpt: Boolean = js.native
    
    var name: String = js.native
    
    var ttype: TType = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TTuple")
  @js.native
  open class TTuple protected () extends TType {
    def this(ttypes: js.Array[TType]) = this()
    
    /* private */ var _restType: Any = js.native
    
    var ttypes: js.Array[TType] = js.native
  }
  
  /* note: abstract class */ @JSImport("ts-interface-checker/dist/types", "TType")
  @js.native
  open class TType () extends StObject {
    
    def getChecker(suite: ITypeSuite, strict: Boolean): CheckerFunc = js.native
    def getChecker(suite: ITypeSuite, strict: Boolean, allowedProps: Set[String]): CheckerFunc = js.native
  }
  
  @JSImport("ts-interface-checker/dist/types", "TUnion")
  @js.native
  open class TUnion protected () extends TType {
    def this(ttypes: js.Array[TType]) = this()
    
    /* private */ var _failMsg: Any = js.native
    
    var ttypes: js.Array[TType] = js.native
  }
  
  inline def array(typeSpec: TypeSpec): TArray = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[TArray]
  
  @JSImport("ts-interface-checker/dist/types", "basicTypes")
  @js.native
  val basicTypes: ITypeSuite = js.native
  
  inline def enumlit(name: String, prop: String): TEnumLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("enumlit")(name.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[TEnumLiteral]
  
  inline def enumtype(values: StringDictionary[String | Double]): TEnumType = ^.asInstanceOf[js.Dynamic].applyDynamic("enumtype")(values.asInstanceOf[js.Any]).asInstanceOf[TEnumType]
  
  inline def func(resultSpec: TypeSpec, params: TParam*): TFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(scala.List(resultSpec.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TFunc]
  
  inline def iface(bases: js.Array[String], props: StringDictionary[TOptional | TypeSpec]): TIface = (^.asInstanceOf[js.Dynamic].applyDynamic("iface")(bases.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[TIface]
  
  @JSImport("ts-interface-checker/dist/types", "indexKey")
  @js.native
  val indexKey: js.Symbol = js.native
  
  inline def intersection(typeSpec: TypeSpec*): TIntersection = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TIntersection]
  
  inline def lit(value: Any): TLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("lit")(value.asInstanceOf[js.Any]).asInstanceOf[TLiteral]
  
  inline def name(value: String): TName = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(value.asInstanceOf[js.Any]).asInstanceOf[TName]
  
  inline def opt(typeSpec: TypeSpec): TOptional = ^.asInstanceOf[js.Dynamic].applyDynamic("opt")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[TOptional]
  
  inline def param(name: String, typeSpec: TypeSpec): TParam = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(name.asInstanceOf[js.Any], typeSpec.asInstanceOf[js.Any])).asInstanceOf[TParam]
  inline def param(name: String, typeSpec: TypeSpec, isOpt: Boolean): TParam = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(name.asInstanceOf[js.Any], typeSpec.asInstanceOf[js.Any], isOpt.asInstanceOf[js.Any])).asInstanceOf[TParam]
  
  inline def rest(typeSpec: TypeSpec): RestType = ^.asInstanceOf[js.Dynamic].applyDynamic("rest")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[RestType]
  
  inline def tuple(typeSpec: TypeSpec*): TTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TTuple]
  
  inline def union(typeSpec: TypeSpec*): TUnion = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[TUnion]
  
  type CheckerFunc = js.Function2[/* value */ Any, /* ctx */ IContext, Boolean]
  
  type ITypeSuite = StringDictionary[TType]
  
  type TypeSpec = TType | String
}
