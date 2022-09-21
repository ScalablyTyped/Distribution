package typings.vfileMessage

import typings.std.Error
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vfile-message", "VFileMessage")
  @js.native
  open class VFileMessage protected ()
    extends StObject
       with Error {
    /**
      * Constructor of a message for `reason` at `place` from `origin`.
      * When an error is passed in as `reason`, copies the `stack`.
      *
      * @param {string|Error} reason Reason for message (`string` or `Error`). Uses the stack and message of the error if given.
      * @param {Node|NodeLike|Position|Point} [place] Place at which the message occurred in a file (`Node`, `Position`, or `Point`, optional).
      * @param {string} [origin] Place in code the message originates from (`string`, optional).
      */
    def this(reason: String) = this()
    def this(reason: js.Error) = this()
    def this(reason: String, place: typings.unist.mod.Node[Data]) = this()
    def this(reason: String, place: typings.unist.mod.Point) = this()
    def this(reason: String, place: typings.unist.mod.Position) = this()
    def this(reason: String, place: NodeLike) = this()
    def this(reason: js.Error, place: typings.unist.mod.Node[Data]) = this()
    def this(reason: js.Error, place: typings.unist.mod.Point) = this()
    def this(reason: js.Error, place: typings.unist.mod.Position) = this()
    def this(reason: js.Error, place: NodeLike) = this()
    def this(reason: String, place: Unit, origin: String) = this()
    def this(reason: String, place: typings.unist.mod.Node[Data], origin: String) = this()
    def this(reason: String, place: typings.unist.mod.Point, origin: String) = this()
    def this(reason: String, place: typings.unist.mod.Position, origin: String) = this()
    def this(reason: String, place: NodeLike, origin: String) = this()
    def this(reason: js.Error, place: Unit, origin: String) = this()
    def this(reason: js.Error, place: typings.unist.mod.Node[Data], origin: String) = this()
    def this(reason: js.Error, place: typings.unist.mod.Point, origin: String) = this()
    def this(reason: js.Error, place: typings.unist.mod.Position, origin: String) = this()
    def this(reason: js.Error, place: NodeLike, origin: String) = this()
    
    /**
      * You can use this to specify the source value that’s being reported, which
      * is deemed incorrect.
      * @type {string?}
      */
    var actual: String | Null = js.native
    
    /**
      * Starting column of error.
      * @type {number?}
      */
    var column: Double | Null = js.native
    
    /**
      * You can use this to suggest values that should be used instead of
      * `actual`, one or more values that are deemed as acceptable.
      * @type {Array<string>?}
      */
    var expected: js.Array[String] | Null = js.native
    
    /**
      * If true, marks associated file as no longer processable.
      * @type {boolean?}
      */
    var fatal: Boolean | Null = js.native
    
    /**
      * You may add a file property with a path of a file (used throughout the VFile ecosystem).
      * @type {string?}
      */
    var file: String | Null = js.native
    
    /**
      * Starting line of error.
      * @type {number?}
      */
    var line: Double | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * You may add a note property with a long form description of the message (supported by vfile-reporter).
      * @type {string?}
      */
    var note: String | Null = js.native
    
    /**
      * Full range information, when available.
      * Has start and end properties, both set to an object with line and column, set to number?.
      * @type {Position?}
      */
    var position: Position | Null = js.native
    
    /**
      * Reason for message.
      * @type {string}
      */
    var reason: String = js.native
    
    /**
      * Category of message.
      * @type {string?}
      */
    var ruleId: String | Null = js.native
    
    /**
      * Namespace of warning.
      * @type {string?}
      */
    var source: String | Null = js.native
    
    /**
      * You may add a url property with a link to documentation for the message.
      * @type {string?}
      */
    var url: String | Null = js.native
  }
  
  type Node = typings.unist.mod.Node[Data]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped object */ trait NodeLike extends StObject {
    
    var position: js.UndefOr[Position] = js.undefined
    
    var `type`: String
  }
  object NodeLike {
    
    inline def apply(`type`: String): NodeLike = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeLike]
    }
    
    extension [Self <: NodeLike](x: Self) {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
