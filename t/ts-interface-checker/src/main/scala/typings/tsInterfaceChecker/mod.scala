package typings.tsInterfaceChecker

import org.scalablytyped.runtime.StringDictionary
import typings.tsInterfaceChecker.distTypesMod.ITypeSuite
import typings.tsInterfaceChecker.distTypesMod.RestType
import typings.tsInterfaceChecker.distTypesMod.TypeSpec
import typings.tsInterfaceChecker.distUtilMod.IErrorDetail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ts-interface-checker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-interface-checker", "BasicType")
  @js.native
  open class BasicType protected ()
    extends typings.tsInterfaceChecker.distTypesMod.BasicType {
    def this(validator: js.Function1[/* value */ Any, Boolean], message: String) = this()
  }
  
  @JSImport("ts-interface-checker", "Checker")
  @js.native
  open class Checker protected () extends StObject {
    def this(suite: ITypeSuite, ttype: typings.tsInterfaceChecker.distTypesMod.TType) = this()
    def this(suite: ITypeSuite, ttype: typings.tsInterfaceChecker.distTypesMod.TType, _path: String) = this()
    
    /**
      * Actual implementation of check() and strictCheck().
      */
    /* private */ var _doCheck: Any = js.native
    
    /* private */ var _doValidate: Any = js.native
    
    /* private */ var _getMethod: Any = js.native
    
    /* private */ var _path: Any = js.native
    
    /**
      * Check that the given value satisfies this checker's type, or throw Error.
      */
    def check(value: Any): Unit = js.native
    
    /* private */ var checkerPlain: Any = js.native
    
    /* private */ var checkerStrict: Any = js.native
    
    /**
      * If this checker is for a function, returns a Checker for its argument-list.
      */
    def getArgs(): Checker = js.native
    
    /**
      * If this checker is for an interface, returns a Checker for the type required for the given
      * property of this interface.
      */
    def getProp(prop: String): Checker = js.native
    
    /**
      * If this checker is for a function, returns a Checker for its result.
      */
    def getResult(): Checker = js.native
    
    /**
      * Return the type for which this is a checker.
      */
    def getType(): typings.tsInterfaceChecker.distTypesMod.TType = js.native
    
    /**
      * If this checker is for an interface, returns a Checker for the argument-list required to call
      * the given method of this interface. E.g. if this Checker is for the interface:
      *    interface Foo {
      *      find(s: string, pos?: number): number;
      *    }
      * Then methodArgs("find").check(...) will succeed for ["foo"] and ["foo", 3], but not for [17].
      */
    def methodArgs(methodName: String): Checker = js.native
    
    /**
      * If this checker is for an interface, returns a Checker for the return value of the given
      * method of this interface.
      */
    def methodResult(methodName: String): Checker = js.native
    
    /* private */ var props: Any = js.native
    
    /**
      * Set the path to report in errors, instead of the default "value". (E.g. if the Checker is for
      * a "person" interface, set path to "person" to report e.g. "person.name is not a string".)
      */
    def setReportedPath(path: String): Unit = js.native
    
    /**
      * Check that the given value satisfies this checker's type strictly. This checks that objects
      * and tuples have no extra members. Note that this prevents backward compatibility, so usually
      * a plain check() is more appropriate.
      */
    def strictCheck(value: Any): Unit = js.native
    
    /**
      * A fast strict check for whether or not the given value satisfies this Checker's type. Returns
      * true or false, does not produce an error message, and is fast both on success and on failure.
      */
    def strictTest(value: Any): Boolean = js.native
    
    /**
      * Returns a non-empty array of error objects describing the errors if the given value does not satisfy this
      * Checker's type strictly, or null if it does.
      */
    def strictValidate(value: Any): js.Array[IErrorDetail] | Null = js.native
    
    /* private */ var suite: Any = js.native
    
    /**
      * A fast check for whether or not the given value satisfies this Checker's type. This returns
      * true or false, does not produce an error message, and is fast both on success and on failure.
      */
    def test(value: Any): Boolean = js.native
    
    /* private */ var ttype: Any = js.native
    
    /**
      * Returns a non-empty array of error objects describing the errors if the given value does not satisfy this
      * Checker's type, or null if it does.
      */
    def validate(value: Any): js.Array[IErrorDetail] | Null = js.native
  }
  
  @JSImport("ts-interface-checker", "TArray")
  @js.native
  open class TArray protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TArray {
    def this(ttype: typings.tsInterfaceChecker.distTypesMod.TType) = this()
  }
  
  @JSImport("ts-interface-checker", "TEnumLiteral")
  @js.native
  open class TEnumLiteral protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TEnumLiteral {
    def this(enumName: String, prop: String) = this()
  }
  
  @JSImport("ts-interface-checker", "TEnumType")
  @js.native
  open class TEnumType protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TEnumType {
    def this(members: StringDictionary[String | Double]) = this()
  }
  
  @JSImport("ts-interface-checker", "TFunc")
  @js.native
  open class TFunc protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TFunc {
    def this(
      paramList: typings.tsInterfaceChecker.distTypesMod.TParamList,
      result: typings.tsInterfaceChecker.distTypesMod.TType
    ) = this()
  }
  
  @JSImport("ts-interface-checker", "TIface")
  @js.native
  open class TIface protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TIface {
    def this(bases: js.Array[String], props: js.Array[typings.tsInterfaceChecker.distTypesMod.TProp]) = this()
    def this(
      bases: js.Array[String],
      props: js.Array[typings.tsInterfaceChecker.distTypesMod.TProp],
      indexType: typings.tsInterfaceChecker.distTypesMod.TOptional
    ) = this()
    def this(
      bases: js.Array[String],
      props: js.Array[typings.tsInterfaceChecker.distTypesMod.TProp],
      indexType: TypeSpec
    ) = this()
  }
  
  @JSImport("ts-interface-checker", "TIntersection")
  @js.native
  open class TIntersection protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TIntersection {
    def this(ttypes: js.Array[typings.tsInterfaceChecker.distTypesMod.TType]) = this()
  }
  
  @JSImport("ts-interface-checker", "TLiteral")
  @js.native
  open class TLiteral protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TLiteral {
    def this(value: Any) = this()
  }
  
  @JSImport("ts-interface-checker", "TName")
  @js.native
  open class TName protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TName {
    def this(name: String) = this()
  }
  
  @JSImport("ts-interface-checker", "TOptional")
  @js.native
  open class TOptional protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TOptional {
    def this(ttype: typings.tsInterfaceChecker.distTypesMod.TType) = this()
  }
  
  @JSImport("ts-interface-checker", "TParam")
  @js.native
  open class TParam protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TParam {
    def this(name: String, ttype: typings.tsInterfaceChecker.distTypesMod.TType, isOpt: Boolean) = this()
  }
  
  @JSImport("ts-interface-checker", "TParamList")
  @js.native
  open class TParamList protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TParamList {
    def this(params: js.Array[typings.tsInterfaceChecker.distTypesMod.TParam]) = this()
  }
  
  @JSImport("ts-interface-checker", "TProp")
  @js.native
  open class TProp protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TProp {
    def this(name: String, ttype: typings.tsInterfaceChecker.distTypesMod.TType, isOpt: Boolean) = this()
  }
  
  @JSImport("ts-interface-checker", "TTuple")
  @js.native
  open class TTuple protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TTuple {
    def this(ttypes: js.Array[typings.tsInterfaceChecker.distTypesMod.TType]) = this()
  }
  
  /* note: abstract class */ @JSImport("ts-interface-checker", "TType")
  @js.native
  open class TType ()
    extends typings.tsInterfaceChecker.distTypesMod.TType
  
  @JSImport("ts-interface-checker", "TUnion")
  @js.native
  open class TUnion protected ()
    extends typings.tsInterfaceChecker.distTypesMod.TUnion {
    def this(ttypes: js.Array[typings.tsInterfaceChecker.distTypesMod.TType]) = this()
  }
  
  @JSImport("ts-interface-checker", "VError")
  @js.native
  open class VError protected ()
    extends typings.tsInterfaceChecker.distUtilMod.VError {
    def this(path: String, message: String) = this()
  }
  
  inline def array(typeSpec: TypeSpec): typings.tsInterfaceChecker.distTypesMod.TArray = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TArray]
  
  inline def createCheckers(typeSuite: ITypeSuite*): ICheckerSuite = ^.asInstanceOf[js.Dynamic].applyDynamic("createCheckers")(typeSuite.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ICheckerSuite]
  
  inline def enumlit(name: String, prop: String): typings.tsInterfaceChecker.distTypesMod.TEnumLiteral = (^.asInstanceOf[js.Dynamic].applyDynamic("enumlit")(name.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TEnumLiteral]
  
  inline def enumtype(values: StringDictionary[String | Double]): typings.tsInterfaceChecker.distTypesMod.TEnumType = ^.asInstanceOf[js.Dynamic].applyDynamic("enumtype")(values.asInstanceOf[js.Any]).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TEnumType]
  
  inline def func(resultSpec: TypeSpec, params: typings.tsInterfaceChecker.distTypesMod.TParam*): typings.tsInterfaceChecker.distTypesMod.TFunc = ^.asInstanceOf[js.Dynamic].applyDynamic("func")(scala.List(resultSpec.asInstanceOf[js.Any]).`++`(params.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TFunc]
  
  inline def iface(
    bases: js.Array[String],
    props: StringDictionary[typings.tsInterfaceChecker.distTypesMod.TOptional | TypeSpec]
  ): typings.tsInterfaceChecker.distTypesMod.TIface = (^.asInstanceOf[js.Dynamic].applyDynamic("iface")(bases.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TIface]
  
  @JSImport("ts-interface-checker", "indexKey")
  @js.native
  val indexKey: js.Symbol = js.native
  
  inline def intersection(typeSpec: TypeSpec*): typings.tsInterfaceChecker.distTypesMod.TIntersection = ^.asInstanceOf[js.Dynamic].applyDynamic("intersection")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TIntersection]
  
  inline def lit(value: Any): typings.tsInterfaceChecker.distTypesMod.TLiteral = ^.asInstanceOf[js.Dynamic].applyDynamic("lit")(value.asInstanceOf[js.Any]).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TLiteral]
  
  inline def name(value: String): typings.tsInterfaceChecker.distTypesMod.TName = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(value.asInstanceOf[js.Any]).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TName]
  
  inline def opt(typeSpec: TypeSpec): typings.tsInterfaceChecker.distTypesMod.TOptional = ^.asInstanceOf[js.Dynamic].applyDynamic("opt")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TOptional]
  
  inline def param(name: String, typeSpec: TypeSpec): typings.tsInterfaceChecker.distTypesMod.TParam = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(name.asInstanceOf[js.Any], typeSpec.asInstanceOf[js.Any])).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TParam]
  inline def param(name: String, typeSpec: TypeSpec, isOpt: Boolean): typings.tsInterfaceChecker.distTypesMod.TParam = (^.asInstanceOf[js.Dynamic].applyDynamic("param")(name.asInstanceOf[js.Any], typeSpec.asInstanceOf[js.Any], isOpt.asInstanceOf[js.Any])).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TParam]
  
  inline def rest(typeSpec: TypeSpec): RestType = ^.asInstanceOf[js.Dynamic].applyDynamic("rest")(typeSpec.asInstanceOf[js.Any]).asInstanceOf[RestType]
  
  inline def tuple(typeSpec: TypeSpec*): typings.tsInterfaceChecker.distTypesMod.TTuple = ^.asInstanceOf[js.Dynamic].applyDynamic("tuple")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TTuple]
  
  inline def union(typeSpec: TypeSpec*): typings.tsInterfaceChecker.distTypesMod.TUnion = ^.asInstanceOf[js.Dynamic].applyDynamic("union")(typeSpec.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typings.tsInterfaceChecker.distTypesMod.TUnion]
  
  @js.native
  trait CheckerT[T] extends Checker
  
  type ICheckerSuite = StringDictionary[Checker]
}
