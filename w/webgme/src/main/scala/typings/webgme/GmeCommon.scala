package typings.webgme

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.webgme.Core.Node
import typings.webgme.GmeStorage.CommitHash
import typings.webgme.GmeStorage.CommitObject
import typings.webgme.anon.Filter
import typings.webgme.anon.Level
import typings.webgme.anon.Ptr
import typings.webgme.webgmeStrings.asset
import typings.webgme.webgmeStrings.boolean
import typings.webgme.webgmeStrings.float
import typings.webgme.webgmeStrings.integer
import typings.webgme.webgmeStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GmeCommon {
  
  type ArtifactHash = String
  
  type Aspect = String
  
  type AttrMeta = js.Any
  
  type Buffer = js.Array[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify GLbyte */ js.Any
  ]
  
  type CatchCallback = ErrorOnlyCallback
  
  type Constraint = String
  
  type Content = DataObject | Buffer | js.Array[Buffer]
  
  type ContentString = String
  
  type CrosscutsInfo = Registry
  
  type DataObject = Node
  
  @js.native
  trait DefAssetObject extends DefObject {
    
    var `type`: asset = js.native
  }
  object DefAssetObject {
    
    @scala.inline
    def apply(`type`: asset): DefAssetObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefAssetObject]
    }
    
    @scala.inline
    implicit class DefAssetObjectMutableBuilder[Self <: DefAssetObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefBoolObject extends DefObject {
    
    var `type`: boolean = js.native
  }
  object DefBoolObject {
    
    @scala.inline
    def apply(`type`: boolean): DefBoolObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefBoolObject]
    }
    
    @scala.inline
    implicit class DefBoolObjectMutableBuilder[Self <: DefBoolObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefFloatObject extends DefObject {
    
    var enum: js.UndefOr[js.Array[Double]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var `type`: float = js.native
  }
  object DefFloatObject {
    
    @scala.inline
    def apply(`type`: float): DefFloatObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefFloatObject]
    }
    
    @scala.inline
    implicit class DefFloatObjectMutableBuilder[Self <: DefFloatObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[Double]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: Double*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setType(value: float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefIntegerObject extends DefObject {
    
    var enum: js.UndefOr[js.Array[Double]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var `type`: integer = js.native
  }
  object DefIntegerObject {
    
    @scala.inline
    def apply(`type`: integer): DefIntegerObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefIntegerObject]
    }
    
    @scala.inline
    implicit class DefIntegerObjectMutableBuilder[Self <: DefIntegerObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[Double]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: Double*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.webgme.GmeCommon.DefStringObject
    - typings.webgme.GmeCommon.DefIntegerObject
    - typings.webgme.GmeCommon.DefFloatObject
    - typings.webgme.GmeCommon.DefBoolObject
    - typings.webgme.GmeCommon.DefAssetObject
  */
  trait DefObject extends StObject
  object DefObject {
    
    @scala.inline
    def DefAssetObject(`type`: asset): typings.webgme.GmeCommon.DefAssetObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefAssetObject]
    }
    
    @scala.inline
    def DefBoolObject(`type`: boolean): typings.webgme.GmeCommon.DefBoolObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefBoolObject]
    }
    
    @scala.inline
    def DefFloatObject(`type`: float): typings.webgme.GmeCommon.DefFloatObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefFloatObject]
    }
    
    @scala.inline
    def DefIntegerObject(`type`: integer): typings.webgme.GmeCommon.DefIntegerObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefIntegerObject]
    }
    
    @scala.inline
    def DefStringObject(`type`: string): typings.webgme.GmeCommon.DefStringObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefStringObject]
    }
  }
  
  @js.native
  trait DefStringObject extends DefObject {
    
    var enum: js.UndefOr[js.Array[String]] = js.native
    
    var regex: js.UndefOr[String] = js.native
    
    var `type`: string = js.native
  }
  object DefStringObject {
    
    @scala.inline
    def apply(`type`: string): DefStringObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefStringObject]
    }
    
    @scala.inline
    implicit class DefStringObjectMutableBuilder[Self <: DefStringObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      @scala.inline
      def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      @scala.inline
      def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      @scala.inline
      def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Dictionary[T] = StringDictionary[T]
  
  type ErrorOnlyCallback = js.Function1[/* err */ Error | Null, Unit]
  
  type ErrorStr = String
  
  type ISO8601 = String
  
  type InAttr = RegObj | Primitive | Null
  
  /**
    * Callback for loadObject.
    *
    * @callback ProjectInterface~loadObjectCallback
    * @param {Error} err - If error occurred.
    * @param {module:Storage~CommitObject|module:Core~ObjectData} object - Object loaded from database, e.g. a commit object.
    */
  type LoadObject = CommitObject | typings.webgme.Core.DataObject
  
  type MemberId = Path
  
  @js.native
  trait Message extends StObject {
    
    var msg: String = js.native
  }
  object Message {
    
    @scala.inline
    def apply(msg: String): Message = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetaCardRule extends StObject {
    
    var items: js.Array[Path] = js.native
    
    var maxItems: js.Array[Double] = js.native
    
    var minItems: js.Array[Double] = js.native
  }
  object MetaCardRule {
    
    @scala.inline
    def apply(items: js.Array[Path], maxItems: js.Array[Double], minItems: js.Array[Double]): MetaCardRule = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaCardRule]
    }
    
    @scala.inline
    implicit class MetaCardRuleMutableBuilder[Self <: MetaCardRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Array[Path]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: Path*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setMaxItems(value: js.Array[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxItemsVarargs(value: Double*): Self = StObject.set(x, "maxItems", js.Array(value :_*))
      
      @scala.inline
      def setMinItems(value: js.Array[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinItemsVarargs(value: Double*): Self = StObject.set(x, "minItems", js.Array(value :_*))
    }
  }
  
  @js.native
  trait MetaInfo extends StObject {
    
    var owner: Node = js.native
    
    var ownerPath: Path = js.native
    
    var target: Node = js.native
    
    var targetPath: Path = js.native
  }
  object MetaInfo {
    
    @scala.inline
    def apply(owner: Node, ownerPath: Path, target: Node, targetPath: Path): MetaInfo = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerPath = ownerPath.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaInfo]
    }
    
    @scala.inline
    implicit class MetaInfoMutableBuilder[Self <: MetaInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwner(value: Node): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwnerPath(value: Path): Self = StObject.set(x, "ownerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetPath(value: Path): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MetaRules extends StObject {
    
    var aspects: Filter = js.native
    
    var attributes: Level = js.native
    
    var children: MetaCardRule = js.native
    
    var constraints: Dictionary[typings.webgme.Core.Constraint] = js.native
    
    var pointers: Ptr = js.native
  }
  object MetaRules {
    
    @scala.inline
    def apply(
      aspects: Filter,
      attributes: Level,
      children: MetaCardRule,
      constraints: Dictionary[typings.webgme.Core.Constraint],
      pointers: Ptr
    ): MetaRules = {
      val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaRules]
    }
    
    @scala.inline
    implicit class MetaRulesMutableBuilder[Self <: MetaRules] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAspects(value: Filter): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributes(value: Level): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: MetaCardRule): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstraints(value: Dictionary[typings.webgme.Core.Constraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointers(value: Ptr): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
    }
  }
  
  type Metadata = StringDictionary[js.Any]
  
  type MetadataHash = String
  
  type Name = String
  
  type NodeId = String
  
  type OutAttr = js.UndefOr[DataObject | Primitive | Null]
  
  type OutPath = js.UndefOr[String | Null]
  
  type Path = String
  
  type Payload = String | Buffer | js.Array[Buffer]
  
  @js.native
  trait Pointer extends StObject {
    
    var from: NodeId = js.native
    
    var to: NodeId = js.native
  }
  object Pointer {
    
    @scala.inline
    def apply(from: NodeId, to: NodeId): Pointer = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pointer]
    }
    
    @scala.inline
    implicit class PointerMutableBuilder[Self <: Pointer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: NodeId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: NodeId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type Primitive = String | Double
  
  type ProjectStart = String | CommitHash | (js.Array[CommitHash | String])
  
  @js.native
  trait Promisable extends StObject {
    
    def `catch`(callback: CatchCallback): Promisable = js.native
    
    def `then`(callback: ThenCallback): Promisable = js.native
  }
  object Promisable {
    
    @scala.inline
    def apply(`catch`: CatchCallback => Promisable, `then`: ThenCallback => Promisable): Promisable = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Promisable]
    }
    
    @scala.inline
    implicit class PromisableMutableBuilder[Self <: Promisable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCatch(value: CatchCallback => Promisable): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setThen(value: ThenCallback => Promisable): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RegObj extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object RegObj {
    
    @scala.inline
    def apply(x: Double, y: Double): RegObj = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegObj]
    }
    
    @scala.inline
    implicit class RegObjMutableBuilder[Self <: RegObj] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type Registry = js.Any
  
  type RelId = String
  
  type ResultCallback[T] = js.Function2[/* err */ Error | Null, /* result */ T, Unit]
  
  type SetId = String
  
  type ThenCallback = VoidCallback
  
  type VoidCallback = js.Function0[Unit]
  
  type VoidFn = js.Function0[Unit]
}
