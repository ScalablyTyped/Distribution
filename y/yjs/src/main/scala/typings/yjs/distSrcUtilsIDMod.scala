package typings.yjs

import typings.lib0.decodingMod.Decoder
import typings.lib0.encodingMod.Encoder
import typings.yjs.distSrcTypesAbstractTypeMod.AbstractType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsIDMod {
  
  @JSImport("yjs/dist/src/utils/ID", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/utils/ID", "ID")
  @js.native
  open class ID protected () extends StObject {
    /**
      * @param {number} client client id
      * @param {number} clock unique per client id, continuous number
      */
    def this(client: Double, clock: Double) = this()
    
    /**
      * Client id
      * @type {number}
      */
    var client: Double = js.native
    
    /**
      * unique per client id, continuous number
      * @type {number}
      */
    var clock: Double = js.native
  }
  
  inline def compareIDs(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")().asInstanceOf[Boolean]
  inline def compareIDs(a: Null, b: ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compareIDs(a: ID): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def compareIDs(a: ID, b: ID): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compareIDs")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def createID(client: Double, clock: Double): ID = (^.asInstanceOf[js.Dynamic].applyDynamic("createID")(client.asInstanceOf[js.Any], clock.asInstanceOf[js.Any])).asInstanceOf[ID]
  
  inline def findRootTypeKey(`type`: AbstractType[Any]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findRootTypeKey")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readID(decoder: Decoder): ID = ^.asInstanceOf[js.Dynamic].applyDynamic("readID")(decoder.asInstanceOf[js.Any]).asInstanceOf[ID]
  
  inline def writeID(encoder: Encoder, id: ID): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeID")(encoder.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
