
# Scala.js typings for wordpress__priority-queue

Typings are for version 1.2

## Library description:
Generic browser priority queue.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @wordpress/priority-queue |
| Keywords           | wordpress, browser, async |
| # releases         | 3 |
| # dependents       | 1 |
| # downloads        | 26028 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/WordPress/gutenberg/tree/master/packages/priority-queue/README.md)
- [Bugs](https://github.com/WordPress/gutenberg/issues)
- [Repository](https://github.com/WordPress/gutenberg)
- [Npm](https://www.npmjs.com/package/%40wordpress%2Fpriority-queue)
    


## Note
This library has been generated from typescript code from [DefinitelyTyped](https://definitelytyped.org).

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
// Type definitions for @wordpress/priority-queue 1.2
// Project: https://github.com/WordPress/gutenberg/tree/master/packages/priority-queue/README.md
// Definitions by: Derek Sifford <https://github.com/dsifford>
// Definitions: https://github.com/DefinitelyTyped/DefinitelyTyped
// TypeScript Version: 3.5
/**
 * Creates a context-aware queue that only executes the last task of a given context.
 *
 * @example
 * ```js
 * import { createQueue } from '@wordpress/priority-queue';
 *
 * const queue = createQueue();
 *
 * // Context objects.
 * const ctx1 = {};
 * const ctx2 = {};
 *
 * // For a given context in the queue, only the last callback is executed.
 * queue.add( ctx1, () => console.log( 'This will be printed first' ) );
 * queue.add( ctx2, () => console.log( 'This won\'t be printed' ) );
 * queue.add( ctx2, () => console.log( 'This will be printed second' ) );
 * ```
 */

```

