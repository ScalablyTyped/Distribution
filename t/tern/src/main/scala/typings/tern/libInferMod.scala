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
import typings.tern.libTernMod.Server
import typings.tern.ternBooleans.`true`
import typings.tern.ternStrings.Array
import typings.tern.ternStrings.bool
import typings.tern.ternStrings.number
import typings.tern.ternStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInferMod {
  
  @JSImport("tern/lib/infer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ANull extends StObject {
    
    def addType(args: Any*): Unit
    
    def forAllProps(args: Any*): Unit
    
    def gatherProperties(args: Any*): Unit
    
    def getFunctionType(args: Any*): js.UndefOr[ANull]
    
    def getObjType(args: Any*): js.UndefOr[ANull | Null]
    
    def getProp(args: Any*): ANull
    
    def getSymbolType(args: Any*): js.UndefOr[ANull]
    
    def getType(args: Any*): js.UndefOr[ANull | Null]
    
    def hasType(args: Any*): Boolean
    
    def isEmpty(args: Any*): Boolean
    
    def propHint(args: Any*): js.UndefOr[String]
    
    def propagate(args: Any*): Unit
    
    def propagatesTo(): Any
    
    def toString(args: Any*): String
    
    def typeHint(args: Any*): js.UndefOr[ANull | Null]
  }
  object ANull {
    
    @JSImport("tern/lib/infer", "ANull")
    @js.native
    val ^ : ANull = js.native
    
    extension [Self <: ANull](x: Self) {
      
      inline def setAddType(value: /* repeated */ Any => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction1(value))
      
      inline def setForAllProps(value: /* repeated */ Any => Unit): Self = StObject.set(x, "forAllProps", js.Any.fromFunction1(value))
      
      inline def setGatherProperties(value: /* repeated */ Any => Unit): Self = StObject.set(x, "gatherProperties", js.Any.fromFunction1(value))
      
      inline def setGetFunctionType(value: /* repeated */ Any => js.UndefOr[ANull]): Self = StObject.set(x, "getFunctionType", js.Any.fromFunction1(value))
      
      inline def setGetObjType(value: /* repeated */ Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "getObjType", js.Any.fromFunction1(value))
      
      inline def setGetProp(value: /* repeated */ Any => ANull): Self = StObject.set(x, "getProp", js.Any.fromFunction1(value))
      
      inline def setGetSymbolType(value: /* repeated */ Any => js.UndefOr[ANull]): Self = StObject.set(x, "getSymbolType", js.Any.fromFunction1(value))
      
      inline def setGetType(value: /* repeated */ Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "getType", js.Any.fromFunction1(value))
      
      inline def setHasType(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "hasType", js.Any.fromFunction1(value))
      
      inline def setIsEmpty(value: /* repeated */ Any => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction1(value))
      
      inline def setPropHint(value: /* repeated */ Any => js.UndefOr[String]): Self = StObject.set(x, "propHint", js.Any.fromFunction1(value))
      
      inline def setPropagate(value: /* repeated */ Any => Unit): Self = StObject.set(x, "propagate", js.Any.fromFunction1(value))
      
      inline def setPropagatesTo(value: () => Any): Self = StObject.set(x, "propagatesTo", js.Any.fromFunction0(value))
      
      inline def setToString_(value: /* repeated */ Any => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
      
      inline def setTypeHint(value: /* repeated */ Any => js.UndefOr[ANull | Null]): Self = StObject.set(x, "typeHint", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait AVal
    extends StObject
       with ANull {
    
    /**
      * Add a type to this abstract value. If the type is already in there,
      * this is a no-op. weight can be given to give this type a non-default
      * weight, which is mostly useful when adding a provisionary type that
      * should be overridden later if a real type is found. The default weight
      * is 100, and passing a weight lower than that will make the type
      * assignment “weak”.
      */
    def addType(`type`: typings.tern.libInferMod.Type): Unit = js.native
    def addType(`type`: typings.tern.libInferMod.Type, weight: Double): Unit = js.native
    
    /** Call the given function for all properties of the object, including properties that are added in the future. */
    def forAllProps(f: js.Function3[/* prop */ String, /* val */ this.type, /* local */ Boolean, Unit]): Unit = js.native
    
    /**
      * Abstract values that are used to represent variables
      * or properties will have, when possible, an `originNode`
      * property pointing to an AST node.
      */
    def gatherProperties(f: js.Function1[/* repeated */ Any, Unit], depth: Double): Unit = js.native
    
    /**
      * Asks the AVal if it contains a function type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getFunctionType(): js.UndefOr[typings.tern.libInferMod.Fn] = js.native
    
    /**
      * Asks the AVal if it contains an Object type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getObjType(): typings.tern.libInferMod.Obj | Null = js.native
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.libInferMod.AVal = js.native
    
    /**
      * Asks the abstract value for its current type. May return `null`
      * when there is no type, or conflicting types are present. When
      * `guess` is true or not given, an empty AVal will try to use
      * heuristics based on its propagation edges to guess a type.
      */
    def getType(): typings.tern.libInferMod.Type | Null = js.native
    def getType(guess: Boolean): typings.tern.libInferMod.Type | Null = js.native
    
    /** Queries whether the AVal _currently_ holds the given type. */
    def hasType(`type`: typings.tern.libInferMod.Type): Boolean = js.native
    
    /** Queries whether the AVal is empty. */
    def isEmpty(): Boolean = js.native
    
    var originNode: js.UndefOr[Node] = js.native
    
    /**
      * Sets this AVal to propagate all types it receives to the given
      * constraint. This is the mechanism by which types are propagated
      * through the type graph.
      */
    def propagate(target: Constraint_): Unit = js.native
    
    val propertyOf: js.UndefOr[typings.tern.libInferMod.Obj] = js.native
    
    val types: js.Array[typings.tern.libInferMod.Type] = js.native
  }
  @JSImport("tern/lib/infer", "AVal")
  @js.native
  val AVal: AValConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "AVal")
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  @js.native
  trait Arr
    extends StObject
       with typings.tern.libInferMod.Obj {
    
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  trait Context extends StObject {
    
    /** The primitive boolean type. */
    var bool: Primnamebool
    
    /** The primitive number type. */
    var num: Primnamenumber
    
    var parent: js.UndefOr[Server] = js.undefined
    
    /** The primitive string type. */
    var str: Primnamestring
    
    var topScope: typings.tern.libInferMod.Scope
  }
  object Context {
    
    @JSImport("tern/lib/infer", "Context")
    @js.native
    val ^ : ContextConstructor = js.native
    
    extension [Self <: Context](x: Self) {
      
      inline def setBool(value: Primnamebool): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setNum(value: Primnamenumber): Self = StObject.set(x, "num", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Server): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setStr(value: Primnamestring): Self = StObject.set(x, "str", value.asInstanceOf[js.Any])
      
      inline def setTopScope(value: typings.tern.libInferMod.Scope): Self = StObject.set(x, "topScope", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Context")
  @js.native
  open class ContextCls protected ()
    extends StObject
       with Context {
    def this(defs: js.Array[Any], parent: Server) = this()
    
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
  
  @js.native
  trait Fn
    extends StObject
       with typings.tern.libInferMod.Obj {
    
    val argNames: js.UndefOr[js.Array[String]] = js.native
    
    val args: js.UndefOr[js.Array[typings.tern.libInferMod.AVal]] = js.native
    
    /**
      * Asks the AVal if it contains a function type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getFunctionType(): typings.tern.libInferMod.Fn = js.native
    
    def isArrowFn(): Boolean = js.native
    
    val retval: typings.tern.libInferMod.AVal = js.native
    
    var self: js.UndefOr[typings.tern.libInferMod.Type] = js.native
  }
  @JSImport("tern/lib/infer", "Fn")
  @js.native
  val Fn: FnConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Fn")
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  @js.native
  trait Obj
    extends StObject
       with IType
       with typings.tern.libInferMod.Type {
    
    /** Looks up the given property, or defines it if it did not yet exist (in which case it will be associated with the given AST node). */
    def defProp(prop: String): typings.tern.libInferMod.AVal = js.native
    def defProp(prop: String, originNode: Node): typings.tern.libInferMod.AVal = js.native
    
    /** Call the given function for all properties of the object, including properties that are added in the future. */
    def forAllProps(
      f: js.Function3[/* prop */ String, /* val */ typings.tern.libInferMod.AVal, /* local */ Boolean, Unit]
    ): Unit = js.native
    
    def gatherProperties(f: js.Function1[/* repeated */ Any, Unit], depth: Double): Unit = js.native
    
    /**
      * Asks the AVal if it contains an Object type. Useful when
      * you aren’t interested in other kinds of types.
      */
    def getObjType(): typings.tern.libInferMod.Obj = js.native
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.libInferMod.AVal = js.native
    
    /** Looks up the AVal associated with the given property, or returns null if it doesn’t exist. */
    def hasProp(prop: String): typings.tern.libInferMod.AVal | Null = js.native
    
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  trait Prim
    extends StObject
       with IType
       with typings.tern.libInferMod.Type {
    
    def gatherProperties(f: js.Function1[/* repeated */ Any, Unit], depth: Double): Unit
    
    /** Get an `AVal` that represents the named property of this type. */
    def getProp(prop: String): typings.tern.libInferMod.AVal
    
    /** The name of the type, if any. */
    var name: string | bool | number
    
    /** The prototype of the object, or null. */
    var proto: Objnamestring
  }
  object Prim {
    
    @JSImport("tern/lib/infer", "Prim")
    @js.native
    val ^ : PrimConstructor = js.native
    
    extension [Self <: Prim](x: Self) {
      
      inline def setGatherProperties(value: (js.Function1[/* repeated */ Any, Unit], Double) => Unit): Self = StObject.set(x, "gatherProperties", js.Any.fromFunction2(value))
      
      inline def setGetProp(value: String => typings.tern.libInferMod.AVal): Self = StObject.set(x, "getProp", js.Any.fromFunction1(value))
      
      inline def setName(value: string | bool | number): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProto(value: Objnamestring): Self = StObject.set(x, "proto", value.asInstanceOf[js.Any])
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Prim")
  @js.native
  open class PrimCls ()
    extends StObject
       with Prim {
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    /** Get an `AVal` that represents the named property of this type. */
    /* CompleteClass */
    override def getProp(prop: String): typings.tern.libInferMod.AVal = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  @js.native
  trait Scope
    extends StObject
       with typings.tern.libInferMod.Obj {
    
    /**
      * Ensures that this scope or some scope above it has a property by the given name
      * (defining it in the top scope if it is missing), and, if the property doesn’t
      * already have an `originNode`, assigns the given node to it.
      */
    def defVar(name: String, originNode: Node): typings.tern.libInferMod.AVal = js.native
  }
  @JSImport("tern/lib/infer", "Scope")
  @js.native
  val Scope: ScopeConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("tern/lib/infer", "Scope")
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
    override def getFunctionType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getObjType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
    /* CompleteClass */
    override def getProp(args: Any*): ANull = js.native
    
    /* CompleteClass */
    override def getSymbolType(args: Any*): js.UndefOr[ANull] = js.native
    
    /* CompleteClass */
    override def getType(): typings.tern.libInferMod.Type = js.native
    /* CompleteClass */
    override def getType(args: Any*): js.UndefOr[ANull | Null] = js.native
    
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
    override def typeHint(args: Any*): js.UndefOr[ANull | Null] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.tern.libInferMod.Obj
    - typings.tern.libInferMod.Prim
  */
  trait Type extends StObject
  @JSImport("tern/lib/infer", "Type")
  @js.native
  val Type: TypeConstructor = js.native
  
  inline def analyze(ast: Program, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def analyze(ast: Program, name: String, scope: typings.tern.libInferMod.Scope): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("analyze")(ast.asInstanceOf[js.Any], name.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tern/lib/infer", "constraint")
  @js.native
  open class constraint protected ()
    extends StObject
       with Instantiable {
    def this(methods: StringDictionary[Any]) = this()
  }
  @JSImport("tern/lib/infer", "constraint")
  @js.native
  val constraint: ConstraintConstructor = js.native
  
  inline def cx(): Context = ^.asInstanceOf[js.Dynamic].applyDynamic("cx")().asInstanceOf[Context]
  
  inline def didGuess(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("didGuess")().asInstanceOf[Boolean]
  
  inline def expressionType(expr: typings.tern.anon.Node): typings.tern.libInferMod.AVal | typings.tern.libInferMod.Type = ^.asInstanceOf[js.Dynamic].applyDynamic("expressionType")(expr.asInstanceOf[js.Any]).asInstanceOf[typings.tern.libInferMod.AVal | typings.tern.libInferMod.Type]
  
  inline def findClosestExpression(ast: Program, start: Double, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findClosestExpression(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findClosestExpression(ast: Program, start: Unit, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findClosestExpression(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findClosestExpression")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  
  inline def findExpressionAround(ast: Program, start: Double, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAround(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAround(ast: Program, start: Unit, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAround(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAround")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  
  inline def findExpressionAt(ast: Program, start: Double, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAt(ast: Program, start: Double, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAt(ast: Program, start: Unit, end: Double): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  inline def findExpressionAt(ast: Program, start: Unit, end: Double, scope: typings.tern.libInferMod.Scope): State | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findExpressionAt")(ast.asInstanceOf[js.Any], start.asInstanceOf[js.Any], end.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[State | Null]
  
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
  
  inline def resetGuessing(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGuessing")().asInstanceOf[Unit]
  inline def resetGuessing(`val`: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetGuessing")(`val`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def scopeAt(ast: Program, pos: Double): typings.tern.libInferMod.Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeAt")(ast.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[typings.tern.libInferMod.Scope]
  inline def scopeAt(ast: Program, pos: Double, scope: typings.tern.libInferMod.Scope): typings.tern.libInferMod.Scope = (^.asInstanceOf[js.Dynamic].applyDynamic("scopeAt")(ast.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[typings.tern.libInferMod.Scope]
  
  inline def withContext[R](context: Context, f: js.Function0[R]): R = (^.asInstanceOf[js.Dynamic].applyDynamic("withContext")(context.asInstanceOf[js.Any], f.asInstanceOf[js.Any])).asInstanceOf[R]
  
  // #### Abstract Values ####
  @js.native
  trait AValConstructor
    extends StObject
       with Instantiable0[typings.tern.libInferMod.AVal]
  
  @js.native
  trait ArrConstructor
    extends StObject
       with /** Constructor that creates an array type with the given content type. */
  Instantiable0[typings.tern.libInferMod.Arr]
       with Instantiable1[/* contentType */ typings.tern.libInferMod.AVal, typings.tern.libInferMod.Arr]
  
  // #### Constraints ####
  @js.native
  trait ConstraintConstructor
    extends StObject
       with Instantiable1[/* methods */ StringDictionary[Any], Instantiable]
  
  trait Constraint_
    extends StObject
       with ANull {
    
    /** May return a string when this constraint is indicative of the presence of a specific property in the source AVal. */
    def propHint(): js.UndefOr[String]
    
    /** May return a type that `getType` can use to “guess” its type based on the fact that it propagates to this constraint. */
    def typeHint(): js.UndefOr[typings.tern.libInferMod.Type]
  }
  object Constraint_ {
    
    inline def apply(
      addType: /* repeated */ Any => Unit,
      forAllProps: /* repeated */ Any => Unit,
      gatherProperties: /* repeated */ Any => Unit,
      getFunctionType: /* repeated */ Any => js.UndefOr[ANull],
      getObjType: /* repeated */ Any => js.UndefOr[ANull | Null],
      getProp: /* repeated */ Any => ANull,
      getSymbolType: /* repeated */ Any => js.UndefOr[ANull],
      getType: /* repeated */ Any => js.UndefOr[ANull | Null],
      hasType: /* repeated */ Any => Boolean,
      isEmpty: /* repeated */ Any => Boolean,
      propHint: () => js.UndefOr[String],
      propagate: /* repeated */ Any => Unit,
      propagatesTo: () => Any,
      toString_ : /* repeated */ Any => String,
      typeHint: () => js.UndefOr[typings.tern.libInferMod.Type]
    ): Constraint_ = {
      val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction1(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), propHint = js.Any.fromFunction0(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), typeHint = js.Any.fromFunction0(typeHint))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[Constraint_]
    }
    
    extension [Self <: Constraint_](x: Self) {
      
      inline def setPropHint(value: () => js.UndefOr[String]): Self = StObject.set(x, "propHint", js.Any.fromFunction0(value))
      
      inline def setTypeHint(value: () => js.UndefOr[typings.tern.libInferMod.Type]): Self = StObject.set(x, "typeHint", js.Any.fromFunction0(value))
    }
  }
  
  // #### Context ####
  @js.native
  trait ContextConstructor
    extends StObject
       with Instantiable2[/* defs */ js.Array[Any], /* parent */ Server, Context]
  
  @js.native
  trait FnConstructor
    extends StObject
       with Instantiable5[
          (/* name */ String) | (/* name */ Unit), 
          /* self */ typings.tern.libInferMod.AVal, 
          /* args */ js.Array[typings.tern.libInferMod.AVal], 
          /* argNames */ js.Array[String], 
          /* retval */ typings.tern.libInferMod.AVal, 
          typings.tern.libInferMod.Fn
        ]
  
  trait IType
    extends StObject
       with ANull {
    
    def getType(): typings.tern.libInferMod.Type
    
    /** Queries whether the AVal _currently_ holds the given type. */
    def hasType(`type`: typings.tern.libInferMod.Type): Boolean
    
    /** The origin file of the type. */
    var origin: String
    
    /**
      * The syntax node that defined the type. Only present for object and function types,
      * and even for those it may be missing (if the type was created by a type definition file,
      * or synthesized in some other way).
      */
    var originNode: js.UndefOr[Node] = js.undefined
    
    /** Return a string that describes the type. maxDepth indicates the depth to which inner types should be shown. */
    def toString(maxDepth: Double): String
  }
  object IType {
    
    inline def apply(
      addType: /* repeated */ Any => Unit,
      forAllProps: /* repeated */ Any => Unit,
      gatherProperties: /* repeated */ Any => Unit,
      getFunctionType: /* repeated */ Any => js.UndefOr[ANull],
      getObjType: /* repeated */ Any => js.UndefOr[ANull | Null],
      getProp: /* repeated */ Any => ANull,
      getSymbolType: /* repeated */ Any => js.UndefOr[ANull],
      getType: () => typings.tern.libInferMod.Type,
      hasType: typings.tern.libInferMod.Type => Boolean,
      isEmpty: /* repeated */ Any => Boolean,
      origin: String,
      propHint: /* repeated */ Any => js.UndefOr[String],
      propagate: /* repeated */ Any => Unit,
      propagatesTo: () => Any,
      toString_ : Double => String,
      typeHint: /* repeated */ Any => js.UndefOr[ANull | Null]
    ): IType = {
      val __obj = js.Dynamic.literal(addType = js.Any.fromFunction1(addType), forAllProps = js.Any.fromFunction1(forAllProps), gatherProperties = js.Any.fromFunction1(gatherProperties), getFunctionType = js.Any.fromFunction1(getFunctionType), getObjType = js.Any.fromFunction1(getObjType), getProp = js.Any.fromFunction1(getProp), getSymbolType = js.Any.fromFunction1(getSymbolType), getType = js.Any.fromFunction0(getType), hasType = js.Any.fromFunction1(hasType), isEmpty = js.Any.fromFunction1(isEmpty), origin = origin.asInstanceOf[js.Any], propHint = js.Any.fromFunction1(propHint), propagate = js.Any.fromFunction1(propagate), propagatesTo = js.Any.fromFunction0(propagatesTo), typeHint = js.Any.fromFunction1(typeHint))
      __obj.updateDynamic("toString")(js.Any.fromFunction1(toString_))
      __obj.asInstanceOf[IType]
    }
    
    extension [Self <: IType](x: Self) {
      
      inline def setGetType(value: () => typings.tern.libInferMod.Type): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
      
      inline def setHasType(value: typings.tern.libInferMod.Type => Boolean): Self = StObject.set(x, "hasType", js.Any.fromFunction1(value))
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginNode(value: Node): Self = StObject.set(x, "originNode", value.asInstanceOf[js.Any])
      
      inline def setOriginNodeUndefined: Self = StObject.set(x, "originNode", js.undefined)
      
      inline def setToString_(value: Double => String): Self = StObject.set(x, "toString", js.Any.fromFunction1(value))
    }
  }
  
  // #### Types ####
  @js.native
  trait ObjConstructor
    extends StObject
       with Instantiable0[typings.tern.libInferMod.Obj]
       with Instantiable1[`true` | (/* proto */ js.Object), typings.tern.libInferMod.Obj]
       with Instantiable2[
          `true` | (/* proto */ Null) | (/* proto */ js.Object), 
          /* name */ String, 
          typings.tern.libInferMod.Obj
        ]
  
  @js.native
  trait PrimConstructor
    extends StObject
       with Instantiable0[Prim]
       with Instantiable1[/* proto */ js.Object, Prim]
       with Instantiable2[(/* proto */ Null) | (/* proto */ js.Object), /* name */ String, Prim]
  
  // #### Scopes ####
  @js.native
  trait ScopeConstructor
    extends StObject
       with Instantiable0[typings.tern.libInferMod.Scope]
       with Instantiable2[
          /* parent */ typings.tern.libInferMod.Scope, 
          /* originNode */ Node, 
          typings.tern.libInferMod.Scope
        ]
  
  @js.native
  trait TypeConstructor
    extends StObject
       with Instantiable0[typings.tern.libInferMod.Type]
}
