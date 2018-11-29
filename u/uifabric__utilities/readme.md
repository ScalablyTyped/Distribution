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
 */
/**
 * @deprecated Use `IProcessedStyleSet` from @uifabric/styling or @uifabric/merge-styles instead.
 */
/**
 * Properties used by render function interface for providing overrideable render callbacks.
 *
 * @public
 */
/**
 * Disposable interface.
 *
 * @public
 */
/**
 * Point interface.
 *
 * @public
 */
/**
 * Rectangle interface.
 *
 * @public
 */
/**
 * An interface representing a component that will not output any DOM, will just render its children and
 * pass through items to modify the children.
 */
/**
 * Render function interface for providing overrideable render callbacks.
 *
 * @public
 */
/**
 * Simulated enum for keycodes. These will get inlined by uglify when used much like an enum
 *
 * @public
 */
/**
 * Rectangle helper class.
 *
 * @public
 */
/**
 * ARIA helper to concatenate attributes, returning undefined if all attributes
 * are undefined. (Empty strings are not a valid ARIA attribute value.)
 *
 * NOTE: This function will NOT insert whitespace between provided attributes.
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
```