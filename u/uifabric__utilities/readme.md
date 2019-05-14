
# Scala.js typings for uifabric__utilities

Typings are for version 6.38.3

## Library description:
Office UI Fabric utilities for building React components.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @uifabric/utilities |
| Keywords           | - |
| # releases         | 206 |
| # dependents       | 20 |
| # downloads        | 2229882 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/OfficeDev/office-ui-fabric-react#readme)
- [Bugs](https://github.com/OfficeDev/office-ui-fabric-react/issues)
- [Repository](https://github.com/OfficeDev/office-ui-fabric-react)
- [Npm](https://www.npmjs.com/package/%40uifabric%2Futilities)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * Bugs often appear in async code when stuff gets disposed, but async operations don't get canceled.
 * This Async helper class solves these issues by tying async code to the lifetime of a disposable object.
 *
 * Usage: Anything class extending from BaseModel can access this helper via this.async. Otherwise create a
 * new instance of the class and remember to call dispose() during your code's dispose handler.
 *
 * @public
 */
/**
 * AutoScroll simply hooks up mouse events given a parent element, and scrolls the container
 * up/down depending on how close the mouse is to the top/bottom of the container.
 *
 * Once you don't want autoscroll any more, just dispose the helper and it will unhook events.
 *
 * @public
 * {@docCategory AutoScroll}
 */
/**
 * EventRecord interface.
 *
 * @internal
 */
/**
 * PerfData interface.
 *
 * @internal
 */
/**
 * Change description used for change callbacks in GlobalSettings.
 *
 * @public
 * {@docCategory IChangeDescription}
 */
/**
 * @deprecated Use `IProcessedStyleSet` from `@uifabric/styling` or `@uifabric/merge-styles` instead.
 */
/**
 * Properties used by render function interface for providing overrideable render callbacks.
 *
 * @public
 * {@docCategory IComponentAsProps}
 */
/**
 * Disposable interface.
 *
 * @public
 * {@docCategory IDisposable}
 */
/**
 * Point interface.
 *
 * @public
 * {@docCategory IPoint}
 */
/**
 * Rectangle interface.
 *
 * @public
 * {@docCategory IRectangle}
 */
/**
 * An interface representing a component that will not output any DOM, will just render its children and
 * pass through items to modify the children.
 *
 * {@docCategory IRenderComponent}
 */
/**
 * Render function interface for providing overrideable render callbacks.
 *
 * @public
 */
/**
 * {@docCategory ISize}
 */
/**
 * Simulated enum for keycodes. These will get inlined by uglify when used much like an enum
 *
 * @public
 * {@docCategory KeyCodes}
 */
/**
 * Rectangle helper class.
 *
 * @public
 * {@docCategory Rectangle}
 */
/**
 * Returns a single function which will call each of the given functions in the context of the
 * parent.
 */
/**
 * ARIA helper to concatenate attributes, returning undefined if all attributes
 * are undefined. (Empty strings are not a valid ARIA attribute value.)
 *
 * @param ariaAttributes - ARIA attributes to merge
 */
/**
 * Helper to find the index of an item within an array, using a callback to
 * determine the match.
 *
 * @public
 * @param array - Array to search.
 * @param cb - Callback which returns true on matches.
 */
/**
 * asAsync - a HOC for async loading components.
 *
 * Usage:
 *
 * const AsyncDialog = asAsync({
 *   load: () => import('Dialog').then(result => result.default),
 * });
 *
 * React.render(domElement, <AsyncDialog asyncPlaceholder={ () => <Spinner/> } { ...dialogProps } />);
 *
 * Note the `asyncPlaceholder` prop will be respected when rendering the async component and it hasn't
 * been loaded yet.
 */
/**
 * AssertNever is a utility function that can be used for exhaustiveness checks in switch statements.
 *
 * @public
 */
/**
 * Autobind is a utility for binding methods in a class. This simplifies tagging methods as being "bound" to the this pointer
 * so that they can be used in scenarios that simply require a function callback.
 * @deprecated This has been deprecated in favor of using arrow function properties
 */
/**
 * Dictionary of booleans.
 *
 * @internal
 */
/**
 * Attached interface for elements which support virtual references.
 * Used internally by the virtual hierarchy methods.
 */
/**
 * Determines whether or not a parent element contains a given child element.
 * If `allowVirtualParents` is true, this method may return `true` if the child
 * has the parent in its virtual element hierarchy.
 *
 * @public
 */
/**
 * Determines if an element, or any of its ancestors, contain the given attribute
 * @param element - element to start searching at
 * @param attribute - the attribute to search for
 * @returns the value of the first instance found
 */
/**
 * Finds the first parent element where the matchFunction returns true
 * @param element - element to start searching at
 * @param matchFunction - the function that determines if the element is a match
 * @returns the matched element or null no match was found
 */
/**
 * Gets the elements which are child elements of the given element.
 * If `allowVirtualChildren` is `true`, this method enumerates virtual child elements
 * after the original children.
 * @param parent - The element to get the children of.
 * @param allowVirtualChildren - true if the method should enumerate virtual child elements.
 */
/**
 * Helper to get the document object. Note that in popup window cases, document
 * might be the wrong document, which is why we look at ownerDocument for the
 * truth. Also note that the SSR flag is used to test ssr scenarios even if
 * document is defined (from JSDOM for example.)
 *
 * @public
 */
/**
 * Gets the element which is the parent of a given element.
 * If `allowVirtuaParents` is `true`, this method prefers the virtual parent over
 * real DOM parent when present.
 *
 * @public
 */
/**
 * Gets the virtual parent given the child element, if it exists.
 *
 * @public
 */
/**
 * Helper to get the window object. The helper will make sure to use a cached variable
 * of "window", to avoid overhead and memory leaks in IE11. Note that in popup scenarios the
 * window object won't match the "global" window object, and for these scenarios, you should
 * pass in an element hosted within the popup.
 *
 * @public
 */
/**
 * Determine whether a target is within a portal from perspective of root or optional parent.
 * This function only works against portal components that use the setPortalAttribute function.
 * If both parent and child are within the same portal this function will return false.
 * @param target - Element to query portal containment status of.
 * @param parent - Optional parent perspective. Search for containing portal stops at parent (or root if parent is undefined or invalid.)
 */
/** Raises a click event. */
/**
 * Sets the virtual parent of an element.
 * Pass `undefined` as the `parent` to clear the virtual parent.
 *
 * @public
 */
/**
 * Extends a component's lifetime methods by appending new functions to the existing lifetime functions.
 */
/**
 * Gets the first focusable element.
 *
 * @public
 */
/**
 * Allows you to hoist methods, except those in an exclusion set from a source object into a destination object.
 *
 * @public
 * @param destination - The instance of the object to hoist the methods onto.
 * @param source - The instance of the object where the methods are hoisted from.
 * @param exclusions - (Optional) What methods to exclude from being hoisted.
 * @returns An array of names of methods that were hoisted.
 */
/**
 * Allows you to hoist static functions in components.
 * Created for the purpose of fixing broken static functions in classes
 * that utilize decorators.
 *
 * @public
 * @param source - The object where the methods are hoisted from.
 * @param dest - The object to hoist the methods onto.
 * @returns The dest object with methods added
 */
/**
 * Get (up to 2 characters) initials based on display name of the persona.
 *
 * @public
 */
/**
 * Returns true if the keycode is a directional keyboard key.
 */
/**
 * Gets the rtl state of the page (returns true if in rtl.)
 *
 * @public
 */
/**
 *  Test utility for providing a custom weakmap.
 *
 * @internal
 * */
/**
 * Simple deep merge function. Takes all arguments and returns a deep copy of the objects merged
 * together in the order provided. If an object creates a circular reference, it will assign the
 * original reference.
 */
/**
 * Returns true if and only if the user is on a iOS device.
 * Used to determine whether iOS-specific behavior should be applied.
 */
/**
 * Compares a to b and b to a.
 *
 * @public
 */
/**
 * Returns true if the user is on a Mac. Caches the result value.
 * @param reset - Reset the cached result value (mainly for testing).
 */
/**
 * Detects whether an element's content has horizontal overflow
 *
 * @public
 * @param element - Element to check for overflow
 * @returns True if element's content overflows
 */
/**
 * An array of events that are allowed on every html element type.
 *
 * @public
 */
/** Sets the current base url used for fetching images. */
/**
 * Gets the rtl state of the page (returns true if in rtl.)
 */
/**
 * String format method, used for scenarios where at runtime you
 * need to evaluate a formatted string given a tokenized string. This
 * usually only is needed in localization scenarios.

 * @example
 * ```tsx
 * "I love {0} every {1}".format("CXP")
 * ```
 * will result in a Debug Exception.
 *
 * @public
 */
/**
 * Warns when props are required if a condition is met.
 *
 * @public
 * @param componentName - The name of the component being used.
 * @param props - The props passed into the component.
 * @param requiredProps - The name of the props that are required when the condition is met.
 * @param conditionalPropName - The name of the prop that the condition is based on.
 * @param condition - Whether the condition is met.
 */

```

