package typings.unifiedEngine

import typings.node.bufferMod.global.Buffer
import typings.std.Record
import typings.unifiedEngine.anon.Create
import typings.unifiedEngine.anon.FilePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFindUpMod {
  
  @JSImport("unified-engine/lib/find-up", "FindUp")
  @js.native
  open class FindUp[Value /* <: js.Object & FilePath */] protected () extends StObject {
    /**
      * @callback Create
      * @param {Buffer} buf
      * @param {string} filePath
      * @returns {Promise<Value|undefined>|Value|undefined}
      */
    /**
      * @callback Callback
      * @param {Error|null} error
      * @param {Value} [result]
      * @returns {void}
      */
    /**
      * @typedef Options
      * @property {string} cwd
      * @property {string|undefined} filePath
      * @property {boolean|undefined} [detect]
      * @property {Array<string>} names
      * @property {Create} create
      */
    /**
      * @param {Options} options
      */
    def this(options: Create[Value]) = this()
    
    /** @type {Record<string, Array<Callback>|undefined|Error|Value>} */
    var cache: Record[
        String, 
        js.UndefOr[
          Value | (js.Array[js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Value], Unit]]) | js.Error
        ]
      ] = js.native
    
    /** @type {Create} */
    def create(buf: Buffer, filePath: String): js.UndefOr[js.Promise[js.UndefOr[Value]] | Value] = js.native
    
    /** @type {string} */
    var cwd: String = js.native
    
    /** @type {boolean|undefined} */
    var detect: js.UndefOr[Boolean] = js.native
    
    /** @type {Error|Value|Array<Callback>|undefined} */
    var givenFile: js.UndefOr[
        Value | (js.Array[js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Value], Unit]]) | js.Error
      ] = js.native
    
    /** @type {string|undefined} */
    var givenFilePath: js.UndefOr[String] = js.native
    
    /**
      * @param {string} filePath
      * @param {Callback} callback
      */
    def load(
      filePath: String,
      callback: js.Function2[/* error */ js.Error | Null, /* result */ js.UndefOr[Value], Unit]
    ): Unit = js.native
    
    /** @type {Array<string>} */
    var names: js.Array[String] = js.native
  }
}
