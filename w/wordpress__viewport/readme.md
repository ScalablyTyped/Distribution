
# Scala.js typings for wordpress__viewport

Typings are for version 2.5

## Library description:
Viewport module for WordPress.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @wordpress/viewport |
| Keywords           | wordpress, viewport |
| # releases         | 25 |
| # dependents       | 7 |
| # downloads        | 69074 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/WordPress/gutenberg/tree/master/packages/viewport/README.md)
- [Bugs](https://github.com/WordPress/gutenberg/issues)
- [Repository](https://github.com/WordPress/gutenberg)
- [Npm](https://www.npmjs.com/package/%40wordpress%2Fviewport)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @wordpress/viewport 2.5
// Project: https://github.com/WordPress/gutenberg/tree/master/packages/viewport/README.md
// Definitions by: Derek Sifford <https://github.com/dsifford>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.5
/**
 * Used in signalling that viewport queries have been updated. Values are specified as an object of
 * breakpoint query keys where value represents whether query matches.
 *
 * @param values - Breakpoint query matches.
 */
/**
 * Returns `true` if the viewport matches the given query, or `false` otherwise.
 *
 * @param query - Query string. Includes operator and breakpoint name, space separated.
 *                Operator defaults to `>=`.
 *
 * @example
 * ```js
 * isViewportMatch( '< huge' );
 * isViewPortMatch( 'medium' );
 * ```
 */

```

