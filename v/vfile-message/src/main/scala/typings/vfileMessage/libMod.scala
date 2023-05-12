package typings.vfileMessage

import typings.std.Error
import typings.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("vfile-message/lib", "VFileMessage")
  @js.native
  open class VFileMessage protected ()
    extends StObject
       with Error {
    /**
      * Create a message for `reason` at `place` from `origin`.
      *
      * When an error is passed in as `reason`, the `stack` is copied.
      *
      * @param {string | Error | VFileMessage} reason
      *   Reason for message, uses the stack and message of the error if given.
      *
      *   > 👉 **Note**: you should use markdown.
      * @param {Node | NodeLike | Position | Point | null | undefined} [place]
      *   Place in file where the message occurred.
      * @param {string | null | undefined} [origin]
      *   Place in code where the message originates (example:
      *   `'my-package:my-rule'` or `'my-rule'`).
      * @returns
      *   Instance of `VFileMessage`.
      */
    def this(
      reason: String | js.Error | VFileMessage,
      place: js.UndefOr[Node | NodeLike | Position | Point | Null],
      origin: js.UndefOr[String | Null]
    ) = this()
    
    /**
      * Specify the source value that’s being reported, which is deemed
      * incorrect.
      *
      * @type {string | null}
      */
    var actual: String | Null = js.native
    
    /**
      * Starting column of error.
      *
      * @type {number | null}
      */
    var column: Double | Null = js.native
    
    /**
      * Suggest acceptable values that can be used instead of `actual`.
      *
      * @type {Array<string> | null}
      */
    var expected: js.Array[String] | Null = js.native
    
    /**
      * State of problem.
      *
      * * `true` — marks associated file as no longer processable (error)
      * * `false` — necessitates a (potential) change (warning)
      * * `null | undefined` — for things that might not need changing (info)
      *
      * @type {boolean | null | undefined}
      */
    var fatal: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * Path of a file (used throughout the `VFile` ecosystem).
      *
      * @type {string | null}
      */
    var file: String | Null = js.native
    
    /**
      * Starting line of error.
      *
      * @type {number | null}
      */
    var line: Double | Null = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Long form description of the message (you should use markdown).
      *
      * @type {string | null}
      */
    var note: String | Null = js.native
    
    /**
      * Full unist position.
      *
      * @type {Position | null}
      */
    var position: Position | Null = js.native
    
    /**
      * Reason for message.
      *
      * > 👉 **Note**: you should use markdown.
      *
      * @type {string}
      */
    var reason: String = js.native
    
    /**
      * Category of message (example: `'my-rule'`).
      *
      * @type {string | null}
      */
    var ruleId: String | Null = js.native
    
    /**
      * Namespace of message (example: `'my-package'`).
      *
      * @type {string | null}
      */
    var source: String | Null = js.native
    
    /**
      * Stack of message.
      *
      * This is used by normal errors to show where something happened in
      * programming code, irrelevant for `VFile` messages,
      *
      * @type {string}
      */
    @JSName("stack")
    var stack_VFileMessage: String = js.native
    
    /**
      * Link to docs for the message.
      *
      * > 👉 **Note**: this must be an absolute URL that can be passed as `x`
      * > to `new URL(x)`.
      *
      * @type {string | null}
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeLike] (val x: Self) extends AnyVal {
      
      inline def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
