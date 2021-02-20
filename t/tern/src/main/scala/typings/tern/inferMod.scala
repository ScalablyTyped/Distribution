package typings.tern

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable5
import org.scalablytyped.runtime.StringDictionary
import typings.estree.mod.Node
import typings.estree.mod.Program
import typings.tern.anon.Instantiable
import typings.tern.anon.Objnamestring
import typings.tern.anon.Primnamebool
import typings.tern.anon.Primnamenumber
import typings.tern.anon.Primnamestring
import typings.tern.anon.State
import typings.tern.ternBooleans.`true`
import typings.tern.ternMod.Server
import typings.tern.ternStrings.Array
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inferMod {
  
  @js.native
  trait ANull extends StObject {
    
    def addType(args: js.Any*): Unit = js.native
    
    def forAllProps(args: js.Any*): Unit = js.native
    
    def gatherProperties(args: js.Any*): Unit = js.native
    
    def getFunctionType(args: js.Any*): js.UndefOr[ANull] = js.native
    
    def getObjType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
    
    def getProp(args: js.Any*): ANull = js.native
    
    def getSymbolType(args: js.Any*): js.UndefOr[ANull] = js.native
    
    def getType(args: js.Any*): js.UndefOr[ANull | Null] = js.native
    
    def hasType(args: js.Any*): Boolean = js.native
    
    def isEmpty(args: js.Any*): Boolean = js.native
    
    def propHint(args: js.Any*): js.UndefOr[String] = js.native
    
    def propagate(args: js.Any*): Unit = js.native
    
    def propagatesTo(): js.Any = js.native
    
    def toString(args: js.Any*): String = js.native
    
    def typeHint(args: js.Any*): js.UndefOr[ANull | Null] = js.native
  }
  object ANull {
    
    @JSImport("tern/lib/infer", "ANull")
    @js.native
    val ^ : ANull = js.native
    
    @scala.inline
    implicit class ANullMutableBuilder[Self <: ANull] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddType(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setForAllProps(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "forAllProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGatherProperties(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "gatherProperties", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetFunctionType(value: /* repeated */ js.Any => js.UndefOr[ANull]): Self = StObject.set(x, "getFunctionType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetObjType(value: /* repeated */ js.Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "getObjType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetProp(value: /* repeated */ js.Any => ANull): Self = StObject.set(x, "getProp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetSymbolType(value: /* repeated */ js.Any => js.UndefOr[ANull]): Self = StObject.set(x, "getSymbolType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetType(value: /* repeated */ js.Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasType(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "hasType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsEmpty(value: /* repeated */ js.Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropHint(value: /* repeated */ js.Any => js.UndefOr[String]): Self = StObject.set(x, "propHint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropagate(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "propagate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPropagatesTo(value: () => js.Any): Self = StObject.set(x, "propagatesTo", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_(value: /* repeated */ js.Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTypeHint(value: /* repeated */ js.Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "typeHint", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AVal extends ANull {
    
    /**
      * Add a type to this abstract value. If the type is already in there,
      * this is a no-op. weight can be given to give this type a non-default
      * weight, which is mostly useful when adding a provisionary type that
      * should be overridden later if a real type is found. The default weight
      * is 100, and passing a weight lower than that will make the type
      * assignment “weak”.
      */
    def addType(`type`: typings.tern.inferMod.Type): Unit = js.native
    def addType(`type`: typings.tern.inferMod.Type, weight: Double): Unit = js.native
    
    /** Call the given function for all properties of the object, including properties that are added in the future. */
    def forAllProps(f: js.Function3[/* prop */ String, /* val */ this.type, /* local */ Boolean, Unit]): Unit = js.native
    
    /**
      * Abstract values that are used to represent variables
      * or properties will have, when possible, an `originNode`
      * property pointing to an AST node.
      */
    def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
    
    /**
      * Asks the AVal if it contains a function type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getFunctionType(): js.UndefOr[typings.tern.inferMod.Fn] = js.native
    
    /**
      * Asks the AVal if it contains an Object type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getObjType(): typings.tern.inferMod.Obj | Null = js.native
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.inferMod.AVal = js.native
    
    /**
      * Asks the abstract value for its current type. May return `null`
      * when there is no type, or conflicting types are present. When
      * `guess` is true or not given, an empty AVal will try to use
      * heuristics based on its propagation edges to guess a type.
      */
    def getType(): typings.tern.inferMod.Type | Null = js.native
    def getType(guess: Boolean): typings.tern.inferMod.Type | Null = js.native
    
    /** Queries whether the AVal _currently_ holds the given type. */
    def hasType(`type`: typings.tern.inferMod.Type): Boolean = js.native
    
    /** Queries whether the AVal is empty. */
    def isEmpty(): Boolean = js.native
    
    var originNode: js.UndefOr[Node] = js.native
    
    /**
      * Sets this AVal to propagate all types it receives to the given
      * constraint. This is the mechanism by which types are propagated
      * through the type graph.
      */
    def propagate(target: Constraint_): Unit = js.native
    
    val propertyOf: js.UndefOr[typings.tern.inferMod.Obj] = js.native
    
    val types: js.Array[typings.tern.inferMod.Type] = js.native
  }
  @JSImport("tern/lib/infer", "AVal")
  @js.native
  val AVal: AValConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "AVal")
  @js.native
  class AValCls ()
    extends typings.tern.inferMod.AVal
  
  @js.native
  trait Arr
    extends typings.tern.inferMod.Obj {
    
    @JSName("name")
    var name_Arr: Array = js.native
  }
  @JSImport("tern/lib/infer", "Arr")
  @js.native
  val Arr: ArrConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Arr")
  @js.native
  /** Constructor that creates an array type with the given content type. */
  class ArrCls ()
    extends typings.tern.inferMod.Arr {
    def this(contentType: typings.tern.inferMod.AVal) = this()
  }
  
  @js.native
  trait Context extends StObject {
    
    /** The primitive boolean type. */
    var bool: Primnamebool = js.native
    
    /** The primitive number type. */
    var num: Primnamenumber = js.native
    
    var parent: js.UndefOr[Server] = js.native
    
    /** The primitive string type. */
    var str: Primnamestring = js.native
    
    var topScope: typings.tern.inferMod.Scope = js.native
  }
  object Context {
    
    @JSImport("tern/lib/infer", "Context")
    @js.native
    val ^ : ContextConstructor = js.native
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBool(value: Primnamebool): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNum(value: Primnamenumber): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: Server): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setStr(value: Primnamestring): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopScope(value: typings.tern.inferMod.Scope): Self = StObject.set(x, "topScope", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Context")
  @js.native
  class ContextCls protected () extends Context {
    def this(defs: js.Array[_], parent: Server) = this()
  }
  
  @js.native
  trait Fn
    extends typings.tern.inferMod.Obj {
    
    val argNames: js.UndefOr[js.Array[String]] = js.native
    
    val args: js.UndefOr[js.Array[typings.tern.inferMod.AVal]] = js.native
    
    /**
      * Asks the AVal if it contains a function type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getFunctionType(): typings.tern.inferMod.Fn = js.native
    
    def isArrowFn(): Boolean = js.native
    
    val retval: typings.tern.inferMod.AVal = js.native
    
    var self: js.UndefOr[typings.tern.inferMod.Type] = js.native
  }
  @JSImport("tern/lib/infer", "Fn")
  @js.native
  val Fn: FnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Fn")
  @js.native
  class FnCls protected ()
    extends typings.tern.inferMod.Fn {
    def this(
      name: js.UndefOr[scala.Nothing],
      self: typings.tern.inferMod.AVal,
      args: js.Array[typings.tern.inferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.inferMod.AVal
    ) = this()
    def this(
      name: String,
      self: typings.tern.inferMod.AVal,
      args: js.Array[typings.tern.inferMod.AVal],
      argNames: js.Array[String],
      retval: typings.tern.inferMod.AVal
    ) = this()
  }
  
  @js.native
  trait Obj
    extends IType
       with typings.tern.inferMod.Type {
    
    /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
    def defProp(prop: String): typings.tern.inferMod.AVal = js.native
    def defProp(prop: String, originNode: Node): typings.tern.inferMod.AVal = js.native
    
    /** Call the given function for all properties of the object, including properties that are added in the future. */
    def forAllProps(
      f: js.Function3[/* prop */ String, /* val */ typings.tern.inferMod.AVal, /* local */ Boolean, Unit]
    ): Unit = js.native
    
    def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
    
    /**
      * Asks the AVal if it contains an Object type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getObjType(): typings.tern.inferMod.Obj = js.native
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.inferMod.AVal = js.native
    
    /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
    def hasProp(prop: String): typings.tern.inferMod.AVal | Null = js.native
    
    /** The name of the type, if any. */
    var name: js.UndefOr[String] = js.native
    
    /** The prototype of the object, or null. */
    var proto: Objnamestring | Null = js.native
  }
  @JSImport("tern/lib/infer", "Obj")
  @js.native
  val Obj: ObjConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Obj")
  @js.native
  class ObjCls ()
    extends typings.tern.inferMod.Obj {
    def this(proto: js.Object) = this()
    def this(proto: `true`) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
    def this(proto: `true`, name: String) = this()
  }
  
  @js.native
  trait Prim
    extends IType
       with typings.tern.inferMod.Type {
    
    def gatherProperties(f: js.Function1[/* repeated */ js.Any, Unit], depth: Double): Unit = js.native
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.inferMod.AVal = js.native
    
    /** The name of the type, if any. */
    var name: string | bool | number = js.native
    
    /** The prototype of the object, or null. */
    var proto: Objnamestring = js.native
  }
  object Prim {
    
    @JSImport("tern/lib/infer", "Prim")
    @js.native
    val ^ : PrimConstructor = js.native
    
    @scala.inline
    implicit class PrimMutableBuilder[Self <: Prim] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGatherProperties(value: (js.Function1[/* repeated */ js.Any, Unit], Double) => Unit): Self = StObject.set(x, "gatherProperties", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetProp(value: String => typings.tern.inferMod.AVal): Self = StObject.set(x, "getProp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: string | bool | number): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProto(value: Objnamestring): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Prim")
  @js.native
  class PrimCls () extends Prim {
    def this(proto: js.Object) = this()
    def this(proto: js.Object, name: String) = this()
    def this(proto: Null, name: String) = this()
  }
  
  @js.native
  trait Scope
    extends typings.tern.inferMod.Obj {
    
    /**
      * Ensures that this scope or some scope above it has a property by the given name
      * (defining it in the top scope if it is missing), and, if the property doesn’t
      * already have an `originNode`, assigns the given node to it.
      */
    def defVar(name: String, originNode: Node): typings.tern.inferMod.AVal = js.native
  }
  @JSImport("tern/lib/infer", "Scope")
  @js.native
  val Scope: ScopeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Scope")
  @js.native
  class ScopeCls ()
    extends typings.tern.inferMod.Scope {
    def this(parent: typings.tern.inferMod.Scope, originNode: Node) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tern.inferMod.Obj
    - typings.tern.inferMod.Prim
  */
  trait Type extends StObject
  @JSImport("tern/lib/infer", "Type")
  @js.native
  val Type: TypeConstructor = js.native
  
  @JSImport("tern/lib/infer", "analyze")
  @js.native
  def analyze(ast: Program, name: String): Unit = js.native
  @JSImport("tern/lib/infer", "analyze")
  @js.native
  def analyze(ast: Program, name: String, scope: typings.tern.inferMod.Scope): Unit = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tern/lib/infer", "constraint")
  @js.native
  class constraint protected () extends Instantiable {
    def this(methods: StringDictionary[js.Any]) = this()
  }
  @JSImport("tern/lib/infer", "constraint")
  @js.native
  val constraint: ConstraintConstructor = js.native
  
  @JSImport("tern/lib/infer", "cx")
  @js.native
  def cx(): Context = js.native
  
  @JSImport("tern/lib/infer", "didGuess")
  @js.native
  def didGuess(): Boolean = js.native
  
  @JSImport("tern/lib/infer", "expressionType")
  @js.native
  def expressionType(expr: State): typings.tern.inferMod.AVal | typings.tern.inferMod.Type = js.native
  
  @JSImport("tern/lib/infer", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findClosestExpression")
  @js.native
  def findClosestExpression(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern/lib/infer", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAround")
  @js.native
  def findExpressionAround(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern/lib/infer", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: js.UndefOr[scala.Nothing], end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: Double, end: Double): typings.tern.anon.Node | Null = js.native
  @JSImport("tern/lib/infer", "findExpressionAt")
  @js.native
  def findExpressionAt(ast: Program, start: Double, end: Double, scope: typings.tern.inferMod.Scope): typings.tern.anon.Node | Null = js.native
  
  @JSImport("tern/lib/infer", "findPropRefs")
  @js.native
  def findPropRefs(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    objType: typings.tern.inferMod.Obj,
    propName: String,
    f: js.Function1[/* Node */ Node, Unit]
  ): Unit = js.native
  
  @JSImport("tern/lib/infer", "findRefs")
  @js.native
  def findRefs(
    ast: Program,
    scope: typings.tern.inferMod.Scope,
    name: String,
    refScope: typings.tern.inferMod.Scope,
    f: js.Function2[/* Node */ Node, /* Scope */ typings.tern.inferMod.Scope, Unit]
  ): Unit = js.native
  
  @JSImport("tern/lib/infer", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String]): Unit = js.native
  @JSImport("tern/lib/infer", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(
    scope: typings.tern.inferMod.Scope,
    origins: js.Array[String],
    start: js.UndefOr[scala.Nothing],
    end: Double
  ): Unit = js.native
  @JSImport("tern/lib/infer", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double): Unit = js.native
  @JSImport("tern/lib/infer", "markVariablesDefinedBy")
  @js.native
  def markVariablesDefinedBy(scope: typings.tern.inferMod.Scope, origins: js.Array[String], start: Double, end: Double): Unit = js.native
  
  @JSImport("tern/lib/infer", "parse")
  @js.native
  def parse(text: String): Program = js.native
  @JSImport("tern/lib/infer", "parse")
  @js.native
  def parse(text: String, options: js.Object): Program = js.native
  
  @JSImport("tern/lib/infer", "purgeMarkedVariables")
  @js.native
  def purgeMarkedVariables(): Unit = js.native
  
  @JSImport("tern/lib/infer", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String]): Unit = js.native
  @JSImport("tern/lib/infer", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: js.UndefOr[scala.Nothing], end: Double): Unit = js.native
  @JSImport("tern/lib/infer", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: Double): Unit = js.native
  @JSImport("tern/lib/infer", "purgeTypes")
  @js.native
  def purgeTypes(origins: js.Array[String], start: Double, end: Double): Unit = js.native
  
  @JSImport("tern/lib/infer", "resetGuessing")
  @js.native
  def resetGuessing(): Unit = js.native
  @JSImport("tern/lib/infer", "resetGuessing")
  @js.native
  def resetGuessing(`val`: Boolean): Unit = js.native
  
  @JSImport("tern/lib/infer", "scopeAt")
  @js.native
  def scopeAt(ast: Program, pos: Double): typings.tern.inferMod.Scope = js.native
  @JSImport("tern/lib/infer", "scopeAt")
  @js.native
  def scopeAt(ast: Program, pos: Double, scope: typings.tern.inferMod.Scope): typings.tern.inferMod.Scope = js.native
  
  @JSImport("tern/lib/infer", "withContext")
  @js.native
  def withContext[R](context: Context, f: js.Function0[R]): R = js.native
  
  // #### Abstract Values ####
  @js.native
  trait AValConstructor
    extends Instantiable0[typings.tern.inferMod.AVal]
  
  @js.native
  trait ArrConstructor
    extends /** Constructor that creates an array type with the given content type. */
  Instantiable0[typings.tern.inferMod.Arr]
       with Instantiable1[/* contentType */ typings.tern.inferMod.AVal, typings.tern.inferMod.Arr]
  
  // #### Constraints ####
  @js.native
  trait ConstraintConstructor
    extends Instantiable1[/* methods */ StringDictionary[js.Any], Instantiable]
  
  @js.native
  trait Constraint_ extends ANull {
    
    /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
    def propHint(): js.UndefOr[String] = js.native
    
    /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
    def typeHint(): js.UndefOr[typings.tern.inferMod.Type] = js.native
  }
  object Constraint_ {
    
    @scala.inline
    def apply(
      addType: /* repeated */ js.Any => Unit,
      forAllProps: /* repeated */ js.Any => Unit,
      gatherProperties: /* repeated */ js.Any => Unit,
      getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
      getObjType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
      getProp: /* repeated */ js.Any => ANull,
      getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
      getType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
      hasType: /* repeated */ js.Any => Boolean,
      isEmpty: /* repeated */ js.Any => Boolean,
      propHint: () => js.UndefOr[String],
      propagate: /* repeated */ js.Any => Unit,
      propagatesTo: () => js.Any,
      toString_ : /* repeated */ js.Any => String,
      typeHint: () => js.UndefOr[typings.tern.inferMod.Type]
    ): Constraint_ = {
      val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction1(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), propHint = js.Any.fromFunction0(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), typeHint = js.Any.fromFunction0(typeHint))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[Constraint_]
    }
    
    @scala.inline
    implicit class Constraint_MutableBuilder[Self <: Constraint_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPropHint(value: () => js.UndefOr[String]): Self = StObject.set(x, "propHint", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTypeHint(value: () => js.UndefOr[typings.tern.inferMod.Type]): Self = StObject.set(x, "typeHint", js.Any.fromFunction0(value))
    }
  }
  
  // #### Context ####
  @js.native
  trait ContextConstructor
    extends Instantiable2[/* defs */ js.Array[js.Any], /* parent */ Server, Context]
  
  @js.native
  trait FnConstructor
    extends Instantiable5[
          js.UndefOr[/* name */ String], 
          /* self */ typings.tern.inferMod.AVal, 
          /* args */ js.Array[typings.tern.inferMod.AVal], 
          /* argNames */ js.Array[String], 
          /* retval */ typings.tern.inferMod.AVal, 
          typings.tern.inferMod.Fn
        ]
  
  @js.native
  trait IType extends ANull {
    
    def getType(): typings.tern.inferMod.Type = js.native
    
    /** Queries whether the AVal _currently_ holds the given type. */
    def hasType(`type`: typings.tern.inferMod.Type): Boolean = js.native
    
    /** The origin file of the type. */
    var origin: String = js.native
    
    /**
      * The syntax node that defined the type. Only present for object and function types,
      * and even for those it may be missing (if the type was created by a type definition file,
      * or synthesized in some other way).
      */
    var originNode: js.UndefOr[Node] = js.native
    
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    def toString(maxDepth: Double): String = js.native
  }
  object IType {
    
    @scala.inline
    def apply(
      addType: /* repeated */ js.Any => Unit,
      forAllProps: /* repeated */ js.Any => Unit,
      gatherProperties: /* repeated */ js.Any => Unit,
      getFunctionType: /* repeated */ js.Any => js.UndefOr[ANull],
      getObjType: /* repeated */ js.Any => js.UndefOr[ANull | Null],
      getProp: /* repeated */ js.Any => ANull,
      getSymbolType: /* repeated */ js.Any => js.UndefOr[ANull],
      getType: () => typings.tern.inferMod.Type,
      hasType: typings.tern.inferMod.Type => Boolean,
      isEmpty: /* repeated */ js.Any => Boolean,
      origin: String,
      propHint: /* repeated */ js.Any => js.UndefOr[String],
      propagate: /* repeated */ js.Any => Unit,
      propagatesTo: () => js.Any,
      toString_ : Double => String,
      typeHint: /* repeated */ js.Any => js.UndefOr[ANull | Null]
    ): IType = {
      val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), origin = origin.asInstanceOf[js.Any], propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), typeHint = js.Any.fromFunction1(typeHint))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[IType]
    }
    
    @scala.inline
    implicit class ITypeMutableBuilder[Self <: IType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetType(value: () => typings.tern.inferMod.Type): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasType(value: typings.tern.inferMod.Type => Boolean): Self = StObject.set(x, "hasType", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginNode(value: Node): Self = StObject.set(x, "originNode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginNodeUndefined: Self = StObject.set(x, "originNode", js.undefined)
      
      @scala.inline
      def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  // #### Types ####
  @js.native
  trait ObjConstructor
    extends Instantiable0[typings.tern.inferMod.Obj]
       with Instantiable1[`true` | (/* proto */ js.Object), typings.tern.inferMod.Obj]
       with Instantiable2[
          `true` | (/* proto */ Null) | (/* proto */ js.Object), 
          /* name */ String, 
          typings.tern.inferMod.Obj
        ]
  
  @js.native
  trait PrimConstructor
    extends Instantiable0[Prim]
       with Instantiable1[/* proto */ js.Object, Prim]
       with Instantiable2[(/* proto */ Null) | (/* proto */ js.Object), /* name */ String, Prim]
  
  // #### Scopes ####
  @js.native
  trait ScopeConstructor
    extends Instantiable0[typings.tern.inferMod.Scope]
       with Instantiable2[
          /* parent */ typings.tern.inferMod.Scope, 
          /* originNode */ Node, 
          typings.tern.inferMod.Scope
        ]
  
  @js.native
  trait TypeConstructor
    extends Instantiable0[typings.tern.inferMod.Type]
}
