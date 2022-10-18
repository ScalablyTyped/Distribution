package typings.yjs

import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typings.yjs.distSrcUtilsDocMod.Doc
import typings.yjs.distSrcUtilsIDMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsRelativePositionMod {
  
  @JSImport("yjs/dist/src/utils/RelativePosition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/RelativePosition", "AbsolutePosition")
  @js.native
  open class AbsolutePosition protected () extends StObject {
    /**
      * @param {AbstractType<any>} type
      * @param {number} index
      * @param {number} [assoc]
      */
    def this(`type`: AbstractType[Any], index: Double) = this()
    def this(`type`: AbstractType[Any], index: Double, assoc: Double) = this()
    
    var assoc: Double = js.native
    
    /**
      * @type {number}
      */
    var index: Double = js.native
    
    /**
      * @type {AbstractType<any>}
      */
    var `type`: AbstractType[Any] = js.native
  }
  
  @JSImport("yjs/dist/src/utils/RelativePosition", "RelativePosition")
  @js.native
  /**
    * @param {ID|null} type
    * @param {string|null} tname
    * @param {ID|null} item
    * @param {number} assoc
    */
  open class RelativePosition () extends StObject {
    def this(`type`: ID) = this()
    def this(`type`: Null, tname: String) = this()
    def this(`type`: ID, tname: String) = this()
    def this(`type`: Null, tname: String, item: ID) = this()
    def this(`type`: Null, tname: Null, item: ID) = this()
    def this(`type`: ID, tname: String, item: ID) = this()
    def this(`type`: ID, tname: Null, item: ID) = this()
    def this(`type`: Null, tname: String, item: Null, assoc: Double) = this()
    def this(`type`: Null, tname: String, item: ID, assoc: Double) = this()
    def this(`type`: Null, tname: Null, item: Null, assoc: Double) = this()
    def this(`type`: Null, tname: Null, item: ID, assoc: Double) = this()
    def this(`type`: ID, tname: String, item: Null, assoc: Double) = this()
    def this(`type`: ID, tname: String, item: ID, assoc: Double) = this()
    def this(`type`: ID, tname: Null, item: Null, assoc: Double) = this()
    def this(`type`: ID, tname: Null, item: ID, assoc: Double) = this()
    
    /**
      * A relative position is associated to a specific character. By default
      * assoc >= 0, the relative position is associated to the character
      * after the meant position.
      * I.e. position 1 in 'ab' is associated to character 'b'.
      *
      * If assoc < 0, then the relative position is associated to the caharacter
      * before the meant position.
      *
      * @type {number}
      */
    var assoc: Double = js.native
    
    /**
      * @type {ID | null}
      */
    var item: ID | Null = js.native
    
    /**
      * @type {string|null}
      */
    var tname: String | Null = js.native
    
    /**
      * @type {ID|null}
      */
    var `type`: ID | Null = js.native
  }
  
  inline def compareRelativePositions(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")().asInstanceOf[Boolean]
  inline def compareRelativePositions(a: Null, b: RelativePosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareRelativePositions(a: RelativePosition): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def compareRelativePositions(a: RelativePosition, b: RelativePosition): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareRelativePositions")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createAbsolutePosition(`type`: AbstractType[Any], index: Double): AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[AbsolutePosition]
  inline def createAbsolutePosition(`type`: AbstractType[Any], index: Double, assoc: Double): AbsolutePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePosition")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[AbsolutePosition]
  
  inline def createAbsolutePositionFromRelativePosition(rpos: RelativePosition, doc: Doc): AbsolutePosition | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("createAbsolutePositionFromRelativePosition")(rpos.asInstanceOf[js.Any], doc.asInstanceOf[js.Any])).asInstanceOf[AbsolutePosition | Null]
  
  inline def createRelativePosition(`type`: AbstractType[Any]): RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any]).asInstanceOf[RelativePosition]
  inline def createRelativePosition(`type`: AbstractType[Any], item: Null, assoc: Double): RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[RelativePosition]
  inline def createRelativePosition(`type`: AbstractType[Any], item: ID): RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[RelativePosition]
  inline def createRelativePosition(`type`: AbstractType[Any], item: ID, assoc: Double): RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePosition")(`type`.asInstanceOf[js.Any], item.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[RelativePosition]
  
  inline def createRelativePositionFromJSON(json: Any): RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[RelativePosition]
  
  inline def createRelativePositionFromTypeIndex(`type`: AbstractType[Any], index: Double): RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[RelativePosition]
  inline def createRelativePositionFromTypeIndex(`type`: AbstractType[Any], index: Double, assoc: Double): RelativePosition = (^.asInstanceOf[js.Dynamic].applyDynamic("createRelativePositionFromTypeIndex")(`type`.asInstanceOf[js.Any], index.asInstanceOf[js.Any], assoc.asInstanceOf[js.Any])).asInstanceOf[RelativePosition]
  
  inline def decodeRelativePosition(uint8Array: js.typedarray.Uint8Array): RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeRelativePosition")(uint8Array.asInstanceOf[js.Any]).asInstanceOf[RelativePosition]
  
  inline def encodeRelativePosition(rpos: RelativePosition): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeRelativePosition")(rpos.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def readRelativePosition(decoder: Decoder): RelativePosition = ^.asInstanceOf[js.Dynamic].applyDynamic("readRelativePosition")(decoder.asInstanceOf[js.Any]).asInstanceOf[RelativePosition]
  
  inline def relativePositionToJSON(rpos: RelativePosition): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("relativePositionToJSON")(rpos.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def writeRelativePosition(encoder: Encoder, rpos: RelativePosition): Encoder = (^.asInstanceOf[js.Dynamic].applyDynamic("writeRelativePosition")(encoder.asInstanceOf[js.Any], rpos.asInstanceOf[js.Any])).asInstanceOf[Encoder]
}
