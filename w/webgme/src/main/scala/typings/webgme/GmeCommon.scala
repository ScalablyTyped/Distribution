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
  
  trait DefAssetObject
    extends StObject
       with DefObject {
    
    var `type`: asset
  }
  object DefAssetObject {
    
    inline def apply(): DefAssetObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("asset")
      __obj.asInstanceOf[DefAssetObject]
    }
    
    extension [Self <: DefAssetObject](x: Self) {
      
      inline def setType(value: asset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefBoolObject
    extends StObject
       with DefObject {
    
    var `type`: boolean
  }
  object DefBoolObject {
    
    inline def apply(): DefBoolObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[DefBoolObject]
    }
    
    extension [Self <: DefBoolObject](x: Self) {
      
      inline def setType(value: boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefFloatObject
    extends StObject
       with DefObject {
    
    var `enum`: js.UndefOr[js.Array[Double]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: float
  }
  object DefFloatObject {
    
    inline def apply(): DefFloatObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("float")
      __obj.asInstanceOf[DefFloatObject]
    }
    
    extension [Self <: DefFloatObject](x: Self) {
      
      inline def setEnum(value: js.Array[Double]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: Double*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefIntegerObject
    extends StObject
       with DefObject {
    
    var `enum`: js.UndefOr[js.Array[Double]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var `type`: integer
  }
  object DefIntegerObject {
    
    inline def apply(): DefIntegerObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[DefIntegerObject]
    }
    
    extension [Self <: DefIntegerObject](x: Self) {
      
      inline def setEnum(value: js.Array[Double]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: Double*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setType(value: integer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def DefAssetObject(): typings.webgme.GmeCommon.DefAssetObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("asset")
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefAssetObject]
    }
    
    inline def DefBoolObject(): typings.webgme.GmeCommon.DefBoolObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("boolean")
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefBoolObject]
    }
    
    inline def DefFloatObject(): typings.webgme.GmeCommon.DefFloatObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("float")
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefFloatObject]
    }
    
    inline def DefIntegerObject(): typings.webgme.GmeCommon.DefIntegerObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("integer")
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefIntegerObject]
    }
    
    inline def DefStringObject(): typings.webgme.GmeCommon.DefStringObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[typings.webgme.GmeCommon.DefStringObject]
    }
  }
  
  trait DefStringObject
    extends StObject
       with DefObject {
    
    var `enum`: js.UndefOr[js.Array[String]] = js.undefined
    
    var regex: js.UndefOr[String] = js.undefined
    
    var `type`: string
  }
  object DefStringObject {
    
    inline def apply(): DefStringObject = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("string")
      __obj.asInstanceOf[DefStringObject]
    }
    
    extension [Self <: DefStringObject](x: Self) {
      
      inline def setEnum(value: js.Array[String]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
      
      inline def setEnumUndefined: Self = StObject.set(x, "enum", js.undefined)
      
      inline def setEnumVarargs(value: String*): Self = StObject.set(x, "enum", js.Array(value :_*))
      
      inline def setRegex(value: String): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
      
      inline def setRegexUndefined: Self = StObject.set(x, "regex", js.undefined)
      
      inline def setType(value: string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
  
  trait Message extends StObject {
    
    var msg: String
  }
  object Message {
    
    inline def apply(msg: String): Message = {
      val __obj = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaCardRule extends StObject {
    
    var items: js.Array[Path]
    
    var maxItems: js.Array[Double]
    
    var minItems: js.Array[Double]
  }
  object MetaCardRule {
    
    inline def apply(items: js.Array[Path], maxItems: js.Array[Double], minItems: js.Array[Double]): MetaCardRule = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], maxItems = maxItems.asInstanceOf[js.Any], minItems = minItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaCardRule]
    }
    
    extension [Self <: MetaCardRule](x: Self) {
      
      inline def setItems(value: js.Array[Path]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: Path*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMaxItems(value: js.Array[Double]): Self = StObject.set(x, "maxItems", value.asInstanceOf[js.Any])
      
      inline def setMaxItemsVarargs(value: Double*): Self = StObject.set(x, "maxItems", js.Array(value :_*))
      
      inline def setMinItems(value: js.Array[Double]): Self = StObject.set(x, "minItems", value.asInstanceOf[js.Any])
      
      inline def setMinItemsVarargs(value: Double*): Self = StObject.set(x, "minItems", js.Array(value :_*))
    }
  }
  
  trait MetaInfo extends StObject {
    
    var owner: Node
    
    var ownerPath: Path
    
    var target: Node
    
    var targetPath: Path
  }
  object MetaInfo {
    
    inline def apply(owner: Node, ownerPath: Path, target: Node, targetPath: Path): MetaInfo = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ownerPath = ownerPath.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetPath = targetPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaInfo]
    }
    
    extension [Self <: MetaInfo](x: Self) {
      
      inline def setOwner(value: Node): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerPath(value: Path): Self = StObject.set(x, "ownerPath", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Node): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetPath(value: Path): Self = StObject.set(x, "targetPath", value.asInstanceOf[js.Any])
    }
  }
  
  trait MetaRules extends StObject {
    
    var aspects: Filter
    
    var attributes: Level
    
    var children: MetaCardRule
    
    var constraints: Dictionary[typings.webgme.Core.Constraint]
    
    var pointers: Ptr
  }
  object MetaRules {
    
    inline def apply(
      aspects: Filter,
      attributes: Level,
      children: MetaCardRule,
      constraints: Dictionary[typings.webgme.Core.Constraint],
      pointers: Ptr
    ): MetaRules = {
      val __obj = js.Dynamic.literal(aspects = aspects.asInstanceOf[js.Any], attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], constraints = constraints.asInstanceOf[js.Any], pointers = pointers.asInstanceOf[js.Any])
      __obj.asInstanceOf[MetaRules]
    }
    
    extension [Self <: MetaRules](x: Self) {
      
      inline def setAspects(value: Filter): Self = StObject.set(x, "aspects", value.asInstanceOf[js.Any])
      
      inline def setAttributes(value: Level): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: MetaCardRule): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setConstraints(value: Dictionary[typings.webgme.Core.Constraint]): Self = StObject.set(x, "constraints", value.asInstanceOf[js.Any])
      
      inline def setPointers(value: Ptr): Self = StObject.set(x, "pointers", value.asInstanceOf[js.Any])
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
  
  trait Pointer extends StObject {
    
    var from: NodeId
    
    var to: NodeId
  }
  object Pointer {
    
    inline def apply(from: NodeId, to: NodeId): Pointer = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pointer]
    }
    
    extension [Self <: Pointer](x: Self) {
      
      inline def setFrom(value: NodeId): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: NodeId): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  type Primitive = String | Double
  
  type ProjectStart = String | CommitHash | (js.Array[CommitHash | String])
  
  trait Promisable extends StObject {
    
    def `catch`(callback: CatchCallback): Promisable
    
    def `then`(callback: ThenCallback): Promisable
  }
  object Promisable {
    
    inline def apply(`catch`: CatchCallback => Promisable, `then`: ThenCallback => Promisable): Promisable = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("catch")(js.Any.fromFunction1(`catch`))
      __obj.updateDynamic("then")(js.Any.fromFunction1(`then`))
      __obj.asInstanceOf[Promisable]
    }
    
    extension [Self <: Promisable](x: Self) {
      
      inline def setCatch(value: CatchCallback => Promisable): Self = StObject.set(x, "catch", js.Any.fromFunction1(value))
      
      inline def setThen(value: ThenCallback => Promisable): Self = StObject.set(x, "then", js.Any.fromFunction1(value))
    }
  }
  
  trait RegObj extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object RegObj {
    
    inline def apply(x: Double, y: Double): RegObj = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegObj]
    }
    
    extension [Self <: RegObj](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
