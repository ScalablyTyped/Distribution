package typings.superstruct

import typings.std.Error
import typings.superstruct.umdStructDashErrorMod.Branch
import typings.superstruct.umdStructDashErrorMod.Failure
import typings.superstruct.umdStructDashErrorMod.Path
import typings.superstruct.umdStructMod.Struct
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("superstruct/umd/struct", JSImport.Namespace)
@js.native
object umdStructMod extends js.Object {
  @js.native
  trait Struct extends js.Object {
    /**
      * The struct's name.
      *
      * ```js
      * 'object'
      * 'union'
      * 'email'
      * ```
      */
    var kind: String = js.native
    /**
      * A string representing the type of the struct. These strings are purely for
      * user-facing error messages, and aren't canonical. They are similar to the
      * syntax that TypeScript uses.
      *
      * ```js
      * '{id,name,email}'
      * 'string | number'
      * 'email'
      * ```
      */
    var `type`: String = js.native
    /**
      * All structs are functions that are shorthand for calling [[Struct.assert]].
      */
    def apply(value: js.Any): js.Any = js.native
    /**
      * Validate a `value`, returning the resulting value, and throwing an error if
      * validation fails.
      *
      * ```js
      * try {
      *   const result = Struct.assert(value)
      *   // ...
      * } catch (e) {
      *   // ...
      * }
      * ```
      */
    def assert(value: js.Any): js.Any = js.native
    /**
      * Run the low-level validation function a struct, returning a tuple that
      * contains either a list of [[Failure]] objects, or a resulting value.
      *
      * This method is fairly low-level and not for normal use.
      *
      * ```js
      * const [failures, result] = Struct.check(value, branch, path)
      * ```
      */
    def check(value: js.Any, branch: Branch, path: Path): js.Tuple2[js.UndefOr[js.Array[Failure]], js.UndefOr[_]] = js.native
    /**
      * Get the default value for a struct.
      *
      * ```js
      * const defaults = Struct.default()
      * ```
      */
    def default(): js.Any = js.native
    /**
      * Create a low-level [[Failure]] object for the struct.
      *
      * ```js
      * const failure = Struct.fail({ value, branch, path })
      * ```
      */
    def fail(obj: Anon_BranchPath): Failure = js.native
    /**
      * Validate a `value`, returning a boolean indicating whether it's valid.
      *
      * Note: Using this method does not give you access to the defaults that may
      * be associated with a struct, so it doesn't guarantee that the value you
      * have passes, just that the value with defaults passes.
      *
      * ```js
      * if (Struct.test(value)) {
      *   // ...
      * }
      * ```
      */
    def test(value: js.Any): Boolean = js.native
    /**
      * Validate a `value` returning a tuple containing an error if the validation
      * fails, or the resulting value if it succeeds.
      *
      * ```js
      * const [error, result] = Struct.validate(value)
      * ```
      */
    def validate(value: js.Any): js.Tuple2[js.UndefOr[Error], js.UndefOr[_]] = js.native
  }
  
  val STRUCT: js.Symbol = js.native
  def createStruct(props: Anon_DefaultsKind): Struct = js.native
  def isStruct(value: js.Any): /* is superstruct.superstruct/umd/struct.Struct */ Boolean = js.native
}

