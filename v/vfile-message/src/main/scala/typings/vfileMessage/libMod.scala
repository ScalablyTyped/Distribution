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
    def this(cause: js.Error) = this()
    def this(cause: VFileMessage) = this()
    def this(reason: String) = this()
    def this(cause: js.Error, origin: String) = this()
    def this(cause: js.Error, parent: Node) = this()
    def this(cause: js.Error, parent: NodeLike) = this()
    def this(cause: js.Error, place: Point) = this()
    def this(cause: js.Error, place: Position) = this()
    def this(cause: VFileMessage, origin: String) = this()
    def this(cause: VFileMessage, parent: Node) = this()
    def this(cause: VFileMessage, parent: NodeLike) = this()
    def this(cause: VFileMessage, place: Point) = this()
    def this(cause: VFileMessage, place: Position) = this()
    def this(reason: String, options: Options) = this()
    def this(reason: String, origin: String) = this()
    def this(reason: String, parent: Node) = this()
    def this(reason: String, parent: NodeLike) = this()
    def this(reason: String, place: Point) = this()
    def this(reason: String, place: Position) = this()
    def this(cause: js.Error, parent: Null, origin: String) = this()
    def this(cause: js.Error, parent: Unit, origin: String) = this()
    def this(cause: js.Error, parent: NodeLike, origin: String) = this()
    def this(cause: js.Error, parent: Node, origin: String) = this()
    def this(cause: js.Error, place: Point, origin: String) = this()
    def this(cause: js.Error, place: Position, origin: String) = this()
    def this(cause: VFileMessage, parent: Null, origin: String) = this()
    def this(cause: VFileMessage, parent: Unit, origin: String) = this()
    def this(cause: VFileMessage, parent: NodeLike, origin: String) = this()
    def this(cause: VFileMessage, parent: Node, origin: String) = this()
    def this(cause: VFileMessage, place: Point, origin: String) = this()
    def this(cause: VFileMessage, place: Position, origin: String) = this()
    def this(reason: String, parent: Null, origin: String) = this()
    def this(reason: String, parent: Unit, origin: String) = this()
    def this(reason: String, parent: NodeLike, origin: String) = this()
    def this(reason: String, parent: Node, origin: String) = this()
    def this(reason: String, place: Point, origin: String) = this()
    def this(reason: String, place: Position, origin: String) = this()
    
    /**
      * Specify the source value that’s being reported, which is deemed
      * incorrect.
      *
      * @type {string | undefined}
      */
    var actual: js.UndefOr[String] = js.native
    
    /**
      * Stack of ancestor nodes surrounding the message.
      *
      * @type {Array<Node> | undefined}
      */
    var ancestors: js.UndefOr[js.Array[Node]] = js.native
    
    /**
      * Original error cause of the message.
      *
      * @type {Error | undefined}
      */
    @JSName("cause")
    var cause_VFileMessage: js.UndefOr[js.Error] = js.native
    
    /**
      * Starting column of message.
      *
      * @type {number | undefined}
      */
    var column: js.UndefOr[Double] = js.native
    
    /**
      * Suggest acceptable values that can be used instead of `actual`.
      *
      * @type {Array<string> | undefined}
      */
    var expected: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * State of problem.
      *
      * * `true` — error, file not usable
      * * `false` — warning, change may be needed
      * * `undefined` — change likely not needed
      *
      * @type {boolean | null | undefined}
      */
    var fatal: js.UndefOr[Boolean | Null] = js.native
    
    /**
      * Path of a file (used throughout the `VFile` ecosystem).
      *
      * @type {string | undefined}
      */
    var file: js.UndefOr[String] = js.native
    
    /**
      * Starting line of error.
      *
      * @type {number | undefined}
      */
    var line: js.UndefOr[Double] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Long form description of the message (you should use markdown).
      *
      * @type {string | undefined}
      */
    var note: js.UndefOr[String] = js.native
    
    /**
      * Place of message.
      *
      * @type {Point | Position | undefined}
      */
    var place: js.UndefOr[Point | Position] = js.native
    
    /**
      * Reason for message, should use markdown.
      *
      * @type {string}
      */
    var reason: String = js.native
    
    /**
      * Category of message (example: `'my-rule'`).
      *
      * @type {string | undefined}
      */
    var ruleId: js.UndefOr[String] = js.native
    
    /**
      * Namespace of message (example: `'my-package'`).
      *
      * @type {string | undefined}
      */
    var source: js.UndefOr[String] = js.native
    
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
      * @type {string | undefined}
      */
    var url: js.UndefOr[String] = js.native
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
  
  trait Options extends StObject {
    
    /**
      * Stack of (inclusive) ancestor nodes surrounding the message (optional).
      */
    var ancestors: js.UndefOr[js.Array[Node] | Null] = js.undefined
    
    /**
      * Original error cause of the message (optional).
      */
    var cause: js.UndefOr[js.Error | Null] = js.undefined
    
    /**
      * Place of message (optional).
      */
    var place: js.UndefOr[Point | Position | Null] = js.undefined
    
    /**
      * Category of message (optional, example: `'my-rule'`).
      */
    var ruleId: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Namespace of who sent the message (optional, example: `'my-package'`).
      */
    var source: js.UndefOr[String | Null] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAncestors(value: js.Array[Node]): Self = StObject.set(x, "ancestors", value.asInstanceOf[js.Any])
      
      inline def setAncestorsNull: Self = StObject.set(x, "ancestors", null)
      
      inline def setAncestorsUndefined: Self = StObject.set(x, "ancestors", js.undefined)
      
      inline def setAncestorsVarargs(value: Node*): Self = StObject.set(x, "ancestors", js.Array(value*))
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseNull: Self = StObject.set(x, "cause", null)
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setPlace(value: Point | Position): Self = StObject.set(x, "place", value.asInstanceOf[js.Any])
      
      inline def setPlaceNull: Self = StObject.set(x, "place", null)
      
      inline def setPlaceUndefined: Self = StObject.set(x, "place", js.undefined)
      
      inline def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
      
      inline def setRuleIdNull: Self = StObject.set(x, "ruleId", null)
      
      inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    }
  }
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
}
