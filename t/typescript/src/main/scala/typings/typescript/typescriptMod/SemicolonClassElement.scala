package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** For when we encounter a semicolon in a class declaration. ES6 allows these as class elements. */
@js.native
trait SemicolonClassElement extends ClassElement {
  @JSName("kind")
  var kind_SemicolonClassElement: typings.typescript.typescriptMod.SyntaxKind.SemicolonClassElement = js.native
  @JSName("parent")
  var parent_SemicolonClassElement: ClassLikeDeclaration = js.native
}

