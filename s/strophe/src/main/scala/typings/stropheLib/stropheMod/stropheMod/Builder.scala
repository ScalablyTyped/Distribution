package typings
package stropheLib.stropheMod.stropheMod

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
@JSImport("Strophe", "Builder")
@js.native
class Builder protected ()
  extends stropheLib.stropheMod.StropheNs.Builder {
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
  def this(name: java.lang.String) = this()
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
  def this(name: java.lang.String, attrs: js.Any) = this()
}

