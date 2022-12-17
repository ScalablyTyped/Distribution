package typings.tern

import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import typings.estree.mod.Program
import typings.tern.anon.Instantiable
import typings.tern.anon.Objnamestring
import typings.tern.anon.Primnamebool
import typings.tern.anon.Primnamenumber
import typings.tern.anon.Primnamestring
import typings.tern.anon.State
import typings.tern.libInferMod.AValConstructor
import typings.tern.libInferMod.ArrConstructor
import typings.tern.libInferMod.ConstraintConstructor
import typings.tern.libInferMod.ContextConstructor
import typings.tern.libInferMod.FnConstructor
import typings.tern.libInferMod.ObjConstructor
import typings.tern.libInferMod.PrimConstructor
import typings.tern.libInferMod.ScopeConstructor
import typings.tern.libInferMod.TypeConstructor
import typings.tern.libTernMod.ConstructorOptions
import typings.tern.libTernMod.Desc
import typings.tern.libTernMod.TernConstructor
import typings.tern.ternBooleans.`true`
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tern", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("tern", "ANull")
  @js.native
  val ANull: typings.tern.libInferMod.ANull = js.native
  
  @JSImport("tern", "AVal")
  @js.native
  val AVal: AValConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "AVal")
  @js.native
  open class AValCls ()
    extends StObject
       with typings.tern.libInferMod.AVal {
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Arr")
  @js.native
  val Arr: ArrConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Arr")
  @js.native
  /** Constructor that creates an array type with the given content type. */
  open class ArrCls ()
    extends StObject
       with typings.tern.libInferMod.Arr {
    def this(contentType: typings.tern.libInferMod.AVal) = this()
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    /** Queries whether the AVal _currently_ holds the given type. */
    /* CompleteClass */
    override def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /** The origin file of the type. */
    /* CompleteClass */
    var origin: String = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    /* CompleteClass */
    override def toString(maxDepth: Double): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Context")
  @js.native
  val Context: ContextConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Context")
  @js.native
  open class ContextCls protected ()
    extends StObject
       with typings.tern.libInferMod.Context {
    def this(defs: js.Array[Any], parent: typings.tern.libTernMod.Server) = this()
    
    /** The primitive boolean type. */
    /* CompleteClass */
    var bool: Primnamebool = js.native
    
    /** The primitive number type. */
    /* CompleteClass */
    var num: Primnamenumber = js.native
    
    /** The primitive string type. */
    /* CompleteClass */
    var str: Primnamestring = js.native
    
    /* CompleteClass */
    var topScope: typings.tern.libInferMod.Scope = js.native
  }
  
  @JSImport("tern", "Fn")
  @js.native
  val Fn: FnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Fn")
  @js.native
  open class FnCls protected ()
    extends StObject
       with typings.tern.libInferMod.Fn {
    def this(
      name: String,
      self: typings.tern.libInferMod.AVal,
      args: js.Array[typings.tern.libInferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.libInferMod.AVal
    ) = this()
    def this(
      name: Unit,
      self: typings.tern.libInferMod.AVal,
      args: js.Array[typings.tern.libInferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.libInferMod.AVal
    ) = this()
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    /** Queries whether the AVal _currently_ holds the given type. */
    /* CompleteClass */
    override def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /** The origin file of the type. */
    /* CompleteClass */
    var origin: String = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    /* CompleteClass */
    override def toString(maxDepth: Double): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Obj")
  @js.native
  val Obj: ObjConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Obj")
  @js.native
  open class ObjCls ()
    extends StObject
       with typings.tern.libInferMod.Obj {
    def this(proto: js.Object) = this()
    def this(proto: `true`) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
    def this(proto: `true`, name: String) = this()
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    /** Queries whether the AVal _currently_ holds the given type. */
    /* CompleteClass */
    override def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /** The origin file of the type. */
    /* CompleteClass */
    var origin: String = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    /* CompleteClass */
    override def toString(maxDepth: Double): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Prim")
  @js.native
  val Prim: PrimConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Prim")
  @js.native
  open class PrimCls ()
    extends StObject
       with typings.tern.libInferMod.Prim {
    def this(proto: js.Object) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    /* CompleteClass */
    override def gatherProperties(f: js.Function1[/* repeated */ Any, Unit], depth: Double): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    /** Get an `AVal` that represents the named property of this type. */
    /* CompleteClass */
    override def getProp(prop: String): typings.tern.libInferMod.AVal = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    /** Queries whether the AVal _currently_ holds the given type. */
    /* CompleteClass */
    override def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /** The name of the type, if any. */
    /* CompleteClass */
    var name: string | bool | number = js.native
    
    /** The origin file of the type. */
    /* CompleteClass */
    var origin: String = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /** The prototype of the object, or null. */
    /* CompleteClass */
    var proto: Objnamestring = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    /* CompleteClass */
    override def toString(maxDepth: Double): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Scope")
  @js.native
  val Scope: ScopeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Scope")
  @js.native
  open class ScopeCls ()
    extends StObject
       with typings.tern.libInferMod.Scope {
    def this(parent: typings.tern.libInferMod.Scope, originNode: Node) = this()
    
    /* CompleteClass */
    override def addType(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def forAllProps(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def gatherProperties(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def getFunctionType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): typings.tern.libInferMod.ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
    
    /* CompleteClass */
    override def hasType(args: Any*): Boolean = js.native
    /** Queries whether the AVal _currently_ holds the given type. */
    /* CompleteClass */
    override def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(args: Any*): Boolean = js.native
    
    /** The origin file of the type. */
    /* CompleteClass */
    var origin: String = js.native
    
    /* CompleteClass */
    override def propHint(args: Any*): js.UndefOr[String] = js.native
    
    /* CompleteClass */
    override def propagate(args: Any*): Unit = js.native
    
    /* CompleteClass */
    override def propagatesTo(): Any = js.native
    
    /* CompleteClass */
    override def toString(args: Any*): String = js.native
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    /* CompleteClass */
    override def toString(maxDepth: Double): String = js.native
    
    /* CompleteClass */
    override def typeHint(args: Any*): js.UndefOr[typings.tern.libInferMod.ANull | Null] = js.native
  }
  
  @JSImport("tern", "Server")
  @js.native
  val Server: TernConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern", "Server")
  @js.native
  open class ServerCls ()
    extends StObject
       with typings.tern.libTernMod.Server {
    def this(options: ConstructorOptions) = this()
  }
  
  @JSImport("tern", "Type")
  @js.native
  val Type: TypeConstructor = js.native
  
  inline def analyze(ast: Program, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def analyze(ast: Program, name: String, scope: typings.tern.libInferMod.Scope): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tern", "constraint")
  @js.native
  open class constraint protected ()
    extends StObject
       with Instantiable {
    def this(methods: StringDictionary[Any]) = this()
  }
  @JSImport("tern", "constraint")
  @js.native
  val constraint: ConstraintConstructor = js.native
  
  inline def cx(): typings.tern.libInferMod.Context = ^.asInstanceOf[js.Dynamic].applyDynamic("cx")().asInstanceOf[typings.tern.libInferMod.Context]
  
  inline def defineQueryType[T /* <: /* import warning: importer.ImportType#apply Failed type conversion: tern.tern/lib/tern.Query['type'] */ js.Any */](name: T, desc: Desc[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineQueryType")(name.asInstanceOf[js.Any], desc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def didGuess(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("didGuess")().asInstanceOf[Boolean]
  
  inline def expressionType(expr: State): typings.tern.libInferMod.AVal | typings.tern.libInferMod.Type = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.tern.libInferMod.AVal | typings.tern.libInferMod.Type]
  
  inline def findClosestExpression(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findClosestExpression(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findClosestExpression(ast: Program, start: Unit, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findClosestExpression(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  
  inline def findExpressionAround(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAround(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAround(ast: Program, start: Unit, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAround(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  
  inline def findExpressionAt(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAt(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAt(ast: Program, start: Unit, end: Double): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  inline def findExpressionAt(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): typings.tern.anon.Node | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.anon.Node | Null]
  
  inline def findPropRefs(
    ast: Program,
    scope: typings.tern.libInferMod.Scope,
    objType: typings.tern.libInferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findPropRefs")(ast.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], objType.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def findRefs(
    ast: Program,
    scope: typings.tern.libInferMod.Scope,
    name: String,
    refScope: typings.tern.libInferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.libInferMod.Scope, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("findRefs")(ast.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], name.asInstanceOf[js.Any], refScope.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markVariablesDefinedBy")(scope.asInstanceOf[js.Any], origins.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String], start: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markVariablesDefinedBy")(scope.asInstanceOf[js.Any], origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String], start: Double, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markVariablesDefinedBy")(scope.asInstanceOf[js.Any], origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def markVariablesDefinedBy(scope: typings.tern.libInferMod.Scope, origins: js.Array[String], start: Unit, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("markVariablesDefinedBy")(scope.asInstanceOf[js.Any], origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parse(text: String): Program = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[Program]
  inline def parse(text: String, options: js.Object): Program = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Program]
  
  inline def purgeMarkedVariables(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeMarkedVariables")().asInstanceOf[Unit]
  
  inline def purgeTypes(origins: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("purgeTypes")(origins.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def purgeTypes(origins: js.Array[String], start: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("purgeTypes")(origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def purgeTypes(origins: js.Array[String], start: Double, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("purgeTypes")(origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def purgeTypes(origins: js.Array[String], start: Unit, end: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("purgeTypes")(origins.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def registerPlugin(
    name: String,
    init: js.Function2[
      /* server */ typings.tern.libTernMod.Server, 
      /* options */ js.UndefOr[ConstructorOptions], 
      Unit
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerPlugin")(name.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def resetGuessing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGuessing")().asInstanceOf[Unit]
  inline def resetGuessing(`val`: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGuessing")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def scopeAt(ast: Program, pos: Double): typings.tern.libInferMod.Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeAt")(ast.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.tern.libInferMod.Scope]
  inline def scopeAt(ast: Program, pos: Double, scope: typings.tern.libInferMod.Scope): typings.tern.libInferMod.Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeAt")(ast.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.libInferMod.Scope]
  
  @JSImport("tern", "version")
  @js.native
  val version: String = js.native
  
  inline def withContext[R](context: typings.tern.libInferMod.Context, f: js.Function0[R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(context.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[R]
}
