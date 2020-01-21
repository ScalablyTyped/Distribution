package typings.strophe.mod.Strophe

import typings.std.Element
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class: Strophe.Builder
  *  XML DOM builder.
  *
  *  This object provides an interface similar to JQuery but for building
  *  DOM element easily and rapidly.  All the functions except for toString()
  *  and tree() return the object, so calls can be chained.  Here's an
  *  example using the $iq() builder helper.
  *  > $iq({to: 'you', from: 'me', type: 'get', id: '1'})
  *  >     .c('query', {xmlns: 'strophe:example'})
  *  >     .c('example')
  *  >     .toString()
  *  The above generates this XML fragment
  *  > <iq to='you' from='me' type='get' id='1'>
  *  >   <query xmlns='strophe:example'>
  *  >     <example/>
  *  >   </query>
  *  > </iq>
  *  The corresponding DOM manipulations to get a similar fragment would be
  *  a lot more tedious and probably involve several helper variables.
  *
  *  Since adding children makes new operations operate on the child, up()
  *  is provided to traverse up the tree.  To add two children, do
  *  > builder.c('child1', ...).up().c('child2', ...)
  *  The next operation on the Builder will be relative to the second child.
  */
@JSImport("strophe", "Strophe.Builder")
@js.native
class Builder protected () extends js.Object {
  /** Constructor: Strophe.Builder
    *  Create a Strophe.Builder object.
    *
    *  The attributes should be passed in object notation.  For example
    *  > var b = new Builder('message', {to: 'you', from: 'me'});
    *  or
    *  > var b = new Builder('messsage', {'xml:lang': 'en'});
    *
    *  Parameters:
    *    (String) name - The name of the root element.
    *    (Object) attrs - The attributes for the root element in object notation.
    *
    *  Returns:
    *    A new Strophe.Builder.
    */
  def this(name: String) = this()
  def this(name: String, attrs: js.Any) = this()
  /** Function: attrs
    *  Add or modify attributes of the current element.
    *
    *  The attributes should be passed in object notation.  This function
    *  does not move the current element pointer.
    *
    *  Parameters:
    *    (Object) moreattrs - The attributes to add/modify in object notation.
    *
    *  Returns:
    *    The Strophe.Builder object.
    */
  def attrs(moreattrs: js.Any): Builder = js.native
  /** Function: c
    *  Add a child to the current element and make it the new current
    *  element.
    *
    *  This function moves the current element pointer to the child,
    *  unless text is provided.  If you need to add another child, it
    *  is necessary to use up() to go back to the parent in the tree.
    *
    *  Parameters:
    *    (String) name - The name of the child.
    *    (Object) attrs - The attributes of the child in object notation.
    *    (String) text - The text to add to the child.
    *
    *  Returns:
    *    The Strophe.Builder object.
    */
  def c(name: String): Builder = js.native
  def c(name: String, attrs: js.Any): Builder = js.native
  def c(name: String, attrs: js.Any, text: String): Builder = js.native
  /** Function: cnode
    *  Add a child to the current element and make it the new current
    *  element.
    *
    *  This function is the same as c() except that instead of using a
    *  name and an attributes object to create the child it uses an
    *  existing DOM element object.
    *
    *  Parameters:
    *    (XMLElement) elem - A DOM element.
    *
    *  Returns:
    *    The Strophe.Builder object.
    */
  def cnode(elem: Node): Builder = js.native
  /** Function: h
    *  Replace current element contents with the HTML passed in.
    *
    *  This *does not* make the child the new current element
    *
    *  Parameters:
    *    (String) html - The html to insert as contents of current element.
    *
    *  Returns:
    *    The Strophe.Builder object.
    */
  def h(html: String): Builder = js.native
  /** Function: t
    *  Add a child text element.
    *
    *  This *does not* make the child the new current element since there
    *  are no children of text elements.
    *
    *  Parameters:
    *    (String) text - The text data to append to the current element.
    *
    *  Returns:
    *    The Strophe.Builder object.
    */
  def t(text: String): Builder = js.native
  /** Function: tree
    *  Return the DOM tree.
    *
    *  This function returns the current DOM tree as an element object.  This
    *  is suitable for passing to functions like Strophe.Connection.send().
    *
    *  Returns:
    *    The DOM tree as a element object.
    */
  def tree(): Element = js.native
  /** Function: up
    *  Make the current parent element the new current element.
    *
    *  This function is often used after c() to traverse back up the tree.
    *  For example, to add two children to the same element
    *  > builder.c('child1', {}).up().c('child2', {});
    *
    *  Returns:
    *    The Stophe.Builder object.
    */
  def up(): Builder = js.native
}

